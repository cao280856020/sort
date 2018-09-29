package test.findComplement;

public class Solution {
	
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.findComplement(5));
	}
	
	
	public int findComplement(int num) {
        int result=0;
        
        String newStr=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<newStr.length();i++){
        	if(newStr.charAt(i)=='1'){
        		sb.append("0");
        	}else{
        		sb.append("1");
        	}
        }
        System.out.println(newStr);
        
        return Integer.valueOf(sb.toString(),2);
    }
}