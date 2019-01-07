package test.shortestToChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	private static Map<Character,Integer> map=new HashMap<>();
	
	static{
		map.put('a', 1);
		map.put('b',2);
		map.put('c',3);
		map.put('d',4);
		map.put('e',5);
		map.put('f',6);
		map.put('g',7);
		map.put('h',8);
		map.put('i',9);
		map.put('j',10);
		map.put('k',11);
		map.put('l',12);
		map.put('m',13);
		map.put('n',14);
		map.put('o',15);
		map.put('p',16);
		map.put('q',17);
		map.put('r',18);
		map.put('s',19);
		map.put('t',20);
		map.put('u',21);
		map.put('v',22);
		map.put('w',23);
		map.put('x',24);
		map.put('y',25);
		map.put('z',26);
	}
	
	
	private int leftCount(String m,int index,char c){
		int leftCount=0;
		while(index>0){
			leftCount++;
			if(m.charAt(--index)==c){
				return leftCount;
			}
		}
		return 0;
	}
	
	private int rightCount(String m,int index,char c){
		int rightCount=0;
		while(index<m.length()-1){
			rightCount++;
			if(m.charAt(++index)==c){
				return rightCount;
			}
		}
		return 0;
	}
	
	private int sumCount(String m,int index,char c){
		if(m.charAt(index)==c){
			return 0;
		}
		
		int leftCount=leftCount(m,index,c);
		int rightCount=rightCount(m,index,c);
		
		int realCount=0;
		
		if(leftCount>0 && rightCount>0){
			realCount=leftCount<rightCount?leftCount:rightCount;
		}else if(leftCount==0){
			realCount=rightCount;
		}else if(rightCount==0){
			realCount=leftCount;
		}
		return realCount;
	}
	
	public int[] shortestToChar(String S, char C) {
		int a[]=new int[S.length()];
        for(int i=0;i<S.length();i++){
        	a[i]=sumCount(S,i,C);
        }
        return a;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		String S = "loveleetcode";
		char C = 'e';
		System.out.println(s.shortestToChar(S, C));
	}

}
