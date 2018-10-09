package test.titleToNumber;


public class Solution {
	
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(LENGTH<<2);
		System.out.println(s.titleToNumber("ZY"));
		System.out.println(s.titleToNumber("AAA"));
	}
	
	private static final String STR="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static final int LENGTH=26;
	/*
	 * 未解决
	 */
	public int titleToNumber(String s) {
        int result=0;
        if(s.length()==1){
        	return STR.indexOf(s.charAt(0));
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
        	sb.append(s.charAt(i));
        }
        
        for(int i=s.toString().length()-1;i>=0;i--){
        	String temp=String.valueOf(sb.toString().charAt(i));
        	
        	for(int in=0;in<i;in++){
        	}
        	
        	
        	if(i==0){
        		result+=STR.indexOf(temp);
        	}else{
        		int j=LENGTH<<(i+1);
            	result+=STR.indexOf(temp)*j;
        	}
        }
        return result;
    }
}