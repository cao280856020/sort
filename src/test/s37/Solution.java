package test.s37;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {
	
	//初始化可用数据
	private Set<Character> initSet(){
		Set<Character> set=new HashSet<>();
		for(char i='1';i<='9';i++){
			set.add(i);
		}
		return set;
	}
	
	private void filterNumber(char[][] board,int row,int cloumn,Set<Character> numberSet){
		for(int i=0;i<board.length;i++){
			char n1=board[row][i];
			char n2=board[i][cloumn];
			if((n1!='.' && numberSet.contains(n1))){
				numberSet.remove(n1);
			}
			if((n2!='.' && numberSet.contains(n2))){
				numberSet.remove(n2);
			}
		}
	}
	
	private LinkedList<Map<String,Stack<Character>>> filterZone(char[][] board,Map<String,Set<Character>> map,Map<String,Set<Character>> zoneMap){
		LinkedList<Map<String,Stack<Character>>> list=new LinkedList<>();
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()){
			String key=it.next();
			String[] str=key.split(":");
			int i=Integer.parseInt(str[0]);
			int j=Integer.parseInt(str[1]);
			int rowZone=i/3;
			int cloumnZone=j/3;
			//获取数据
			String zoneKey=rowZone+":"+cloumnZone;
			Set<Character> zoneSet=zoneMap.get(zoneKey);
			Set<Character> numberSet=map.get(key);
			//都不为空时才去删除
			Stack<Character> stack=new Stack<>();
			if(zoneSet!=null && zoneSet.size()>0 && numberSet!=null && numberSet.size()>0){
				numberSet.removeAll(zoneSet);
			}
			for(Character item:numberSet){
				stack.push(item);
			}
			
			this.sortLinkedHashMap(list, key, stack);
		}
		return list;
	}
	
	private void sortLinkedHashMap(LinkedList<Map<String,Stack<Character>>> list,String key,Stack<Character> stack){
		Map<String,Stack<Character>> map=new HashMap<>();
		map.put(key, stack);
		if(list.size()==0){
			list.add(map);
			return;
		}
		for(int i=0;i<list.size();i++){
			Map<String,Stack<Character>> tmap=list.get(i);
			Iterator<String> it=tmap.keySet().iterator();
			//小于之前值就放入到前面
			if(stack.size()<tmap.get(it.next()).size()){
				list.add(i, map);
				return;
			}
		}
		list.add(map);
	}
	
	private Map<String,Stack<Character>> stackMap=null;
	
	private Map<String,Stack<Character>> oldMap=null;
	
	private void dfs(LinkedList<Map<String,Stack<Character>>> list,char[][] board,int i,boolean backFlag){
		//如果已经到达最后一级就结束
		if(i==list.size()-1){
			return;
		}
		//取到值
		Map<String,Stack<Character>> map=list.get(i);
		Iterator<String> it=map.keySet().iterator();
		String key=it.next();
		Stack<Character> stack=map.get(key);
		if(stack.size()==0){
			return;
		}
		//记录旧数据
		oldMap.put(key, stack);
		
		//赋值
		String[] str=key.split(":");
		int row=Integer.parseInt(str[0]);
		int cloumn=Integer.parseInt(str[1]);
		char charNumber=stack.pop();
		//比较是否可用
		board[row][cloumn]=charNumber;
		i++;
		this.dfs(list, board, i, false);
		
	}
	
	public void solveSudoku(char[][] board) {
		
		Map<String,Set<Character>> map=new HashMap<>();
		
		Map<String,Set<Character>> zoneMap=new HashMap<>();
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				char n=board[i][j];
				if(n=='.'){
					//拿到备用的数据
					String key=i+":"+j;
					Set<Character> numberSet=map.get(key);
					if(numberSet==null){
						numberSet=this.initSet();
						map.put(key, numberSet);
					}
					//行，列过滤掉不可用的数据
					this.filterNumber(board, i, j, numberSet);
				}else{
					//判断区域
					int rowZone=i/3;
					int cloumnZone=j/3;
					String zoneKey=rowZone+":"+cloumnZone;
					Set<Character> zoneSet=zoneMap.get(zoneKey);
					if(zoneSet==null){
						zoneSet=new HashSet<>();
						zoneMap.put(zoneKey, zoneSet);
					}
					//没有被访问过
					zoneSet.add(n);
				}
			}
		}
		//过滤区域数据
		LinkedList<Map<String,Stack<Character>>> list=this.filterZone(board, map, zoneMap);
		System.out.println(list);
		stackMap=new HashMap<>();
		oldMap=new HashMap<>();
		this.dfs(list, board, 0, false);
    }
	private char[][] buildChar(){
		char[][] board=new char[9][9];
		
		String str="'5','3','.','.','7','.','.','.','.'],['6','.','.','1','9','5','.','.','.'],['.','9','8','.','.','.','.','6','.'],['8','.','.','.','6','.','.','.','3'],['4','.','.','8','.','3','.','.','1'],['7','.','.','.','2','.','.','.','6'],['.','6','.','.','.','.','2','8','.'],['.','.','.','4','1','9','.','.','5'],['.','.','.','.','.','8','.','7','9'";
		
		String[] ss=str.split("\\],\\[");
		
		for(int i=0;i<ss.length;i++){
			String[] subStr=ss[i].split(",");
			for(int j=0;j<subStr.length;j++){
				board[i][j]=subStr[j].replaceAll("'", "").charAt(0);
			}
		}
		return board;
	}
	
	public static void main(String[] args) {
		Solution s=new Solution();
		char[][] board=s.buildChar();

		long start=System.currentTimeMillis();
		s.solveSudoku(board);
		System.out.println(System.currentTimeMillis()-start);
		
		
	}

}
