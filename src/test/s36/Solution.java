package test.s36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	public boolean isValidSudoku(char[][] board) {
		
		//定义set
		Map<Integer,Set<Character>> cloumnMap=new HashMap<>();
		
		Map<String,Set<Character>> zoneMap=new HashMap<>();
		
		for(int i=0;i<9;i++){
			
			Set<Character> jSet=new HashSet<>();
			for(int j=0;j<9;j++){
				char cc=board[i][j];
				//空时退出
				if(cc=='.'){
					continue;
				}
				
				//判断jSet
				if(!jSet.add(cc)){
					return false;
				}
				
				Set<Character> cloumnSet=cloumnMap.get(j);
				if(cloumnSet==null){
					cloumnSet=new HashSet<Character>();
					cloumnMap.put(j, cloumnSet);
				}
				if(!cloumnSet.add(board[i][j])){
					return false;
				}
				
				//判断区域
				int iZone=i/3;
				int jZone=j/3;
				//获取char
				String key=iZone+""+jZone;
				Set<Character> zoneSet=zoneMap.get(key);
				if(zoneSet==null){
					zoneSet=new HashSet<Character>();
					zoneMap.put(key, zoneSet);
				}
				
				//没有被访问过
				if(!zoneSet.add(board[i][j])){
					return false;
				}
			}
		}
		return true;
    }
	
	private char[][] buildChar(){
		char[][] board=new char[9][9];
		
		String str="'.','.','4','.','.','.','6','3','.'],['.','.','.','.','.','.','.','.','.'],['5','.','.','.','.','.','.','9','.'],['.','.','.','5','6','.','.','.','.'],['4','.','3','.','.','.','.','.','1'],['.','.','.','7','.','.','.','.','.'],['.','.','.','5','.','.','.','.','.'],['.','.','.','.','.','.','.','.','.'],['.','.','.','.','.','.','.','.','.'";
		
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
		s.isValidSudoku(board);
		System.out.println(System.currentTimeMillis()-start);
	}

}
