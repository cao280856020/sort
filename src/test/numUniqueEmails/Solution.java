package test.numUniqueEmails;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
    	Set<String> set=new HashSet<>();
        for(int i=0;i<emails.length;i++){
        	String email=emails[i];
        	String lastStr=email.substring(email.indexOf("@"));
        	String firstStr=email.substring(0,email.indexOf("+"));
        	
        	set.add(firstStr.replace(".", "")+lastStr);
        }
        return set.size();
    }
    
    public static void main(String[] arg){
    	Solution s=new Solution();
    	String[] emails=new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    	int ss=s.numUniqueEmails(emails);
    	System.out.println(ss);
    }
}
