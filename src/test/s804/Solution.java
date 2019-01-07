package test.s804;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public final static String[] str={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	public int uniqueMorseRepresentations(String[] words) {
		Set<String> s=new HashSet<>();
        for(int i=0;i<words.length;i++){
        	String tt=words[i];
        	StringBuilder sb=new StringBuilder();
        	for(int j=0;j<tt.length();j++){
        		int index=tt.charAt(j)-'a';
        		sb.append(str[index]);
        	}
        	s.add(sb.toString());
        }
		return s.size();
    }
	
	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		Solution s=new Solution();
		System.out.println(s.uniqueMorseRepresentations(words));
	}

}
