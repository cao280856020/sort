package test.addDigits;

public class Solution {
	
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.addDigits(38));
	}
	
	
	public int addDigits(int num) {
        String newStr=num+"";
        if(newStr.length()==1){
        	return num;
        }
        int newNum=0;
        for(int i=0;i<newStr.length();i++){
        	String temp=String.valueOf(newStr.charAt(i));
        	System.out.println(temp);
        	newNum+=Integer.valueOf(temp);
        }
        return addDigits(newNum);
    }
}