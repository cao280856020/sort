package test.hasAlternatingBits;

public class Solution {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.hasAlternatingBits(5));
		System.out.println(s.hasAlternatingBits(7));
		System.out.println(s.hasAlternatingBits(11));
		System.out.println(s.hasAlternatingBits(10));
	}
	
	public boolean hasAlternatingBits(int n) {
        boolean flag=true;
        
        String e=Integer.toBinaryString(n);
        for(int out=0;out<e.length()-1;out++){
    		if(e.charAt(out)==e.charAt(out+1)){
    			return false;
    		}
        }
        return flag;
    }

}
