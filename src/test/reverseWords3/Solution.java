package test.reverseWords3;

public class Solution {
	
	private static String reverseWord(String s){
		if(s==null || s.length()==0){
			return "";
		}
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	
	public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] ss=s.split("\\s");
        for(int i=0;i<ss.length;i++){
        	sb.append(reverseWord(ss[i]));
        	if(i!=ss.length-1){
        		sb.append(" ");
        	}
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		String s2=s.reverseWords("Let's take LeetCode contest");
		System.out.println(s2);
	}

}
