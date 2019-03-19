package test.s202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	/*
	 * 12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1
	 */
	public boolean isHappy(int n) {
        
        Set<String> s=new HashSet<>();
        
        String nStr=n+"";
        while(!"1".equals(nStr)){
        	String nTemp="0";
        	for(int i=0;i<nStr.length();i++){
        		int tempC=nStr.charAt(i)-48;
        		nTemp=Integer.parseInt(nTemp)+(tempC*tempC)+"";
        	}
        	if(!s.add(nTemp)){
        		return false;
        	}
        	nStr=nTemp;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int n=19;
		System.out.println(s.isHappy(n));
		char c='1';
		n=c-48;
		System.out.println(n);
	}

}
