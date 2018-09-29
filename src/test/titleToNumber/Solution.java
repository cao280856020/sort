package test.titleToNumber;


public class Solution {
	
	public static void main(String[] args){
		Solution s=new Solution();
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
        System.out.println(sb.toString());
        
        for(int i=s.toString().length()-1;i>=0;i--){
        	String temp=String.valueOf(sb.toString().charAt(i));
        	if(i==0){
        		result+=STR.indexOf(temp);
        	}else if(i>1){
        		for(int in=1;in<i;in++){
        			result+=LENGTH*LENGTH;
        		}
        	}else{
            	result+=STR.indexOf(temp)*LENGTH;
        	}
        }
        return result;
    }
}