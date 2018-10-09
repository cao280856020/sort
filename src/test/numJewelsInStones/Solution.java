package test.numJewelsInStones;

public class Solution {
	
	static int count=0;
	
	public void reCheck(String S,String out){
		if(S.length()==0){
			return;
		}
		int index=S.indexOf(out);
		if(index>-1){
			++count;
			reCheck(S.substring(index+1),out);
		}
	}
	
    public int numJewelsInStones(String J, String S) {
    	count=0;
    	for(int j=0;j<J.length();j++){
    		String out=String.valueOf(J.charAt(j));
    		reCheck(S,out);
    	}
        return count;
    }
    public static void main(String[] a){
    	String J = "z", S = "ZZ";
    	Solution s=new Solution();
    	System.out.println(s.numJewelsInStones(J, S));
    }
}
