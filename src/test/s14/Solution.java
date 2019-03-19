package test.s14;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
        StringBuilder common=new StringBuilder();
        
        String temp=strs[0];
        
        int index=0;
        for(int i=1;i<strs.length;i++){
        	String s=strs[i];
        	if(temp.contains(s.charAt(0)+"")){
        		
        	}
        }
        
        return common.toString();
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		String[] strs={"flower","flow","flight"};
		System.out.println(s.longestCommonPrefix(strs));
	}

}
