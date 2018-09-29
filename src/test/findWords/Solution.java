package test.findWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args){
		Solution s=new Solution();
		
		String[] words={"Hello", "Alaska", "Dad", "Peace"};
		
		for(String w:s.findWords(words)){
			System.out.println(w);
		}
	}
	
	private static final String F="QWERTYUIOP";
	private static final String S="ASDFGHJKL";
	private static final String T="ZXCVBNM";
	private static final List<String> LIST=new ArrayList<>();
	static {
		LIST.add(F);
		LIST.add(S);
		LIST.add(T);
	}
	
	private String switchStr(String s){
		for(String str:LIST){
			if(str.contains(s.toUpperCase())){
				return str;
			}
		}
		return null;
	}
	
	public String[] findWords(String[] words) {
		String[] returnStr=new String[words.length];
		int elements=0;
        for(int i=0;i<words.length;i++){
        	String temp=words[i];
        	String tempStr=F;
        	boolean flag=true;
        	for(int j=0;j<temp.length();j++){
        		String t=String.valueOf(temp.charAt(j));
        		if(j==0){//选择哪一行键盘
        			tempStr=switchStr(t);
        		}
        		if(!tempStr.contains(t.toUpperCase())){
        			flag=false;
        			break;
        		}
        	}
        	if(flag){
        		returnStr[elements++]=temp;
        	}
        }
        String[] returnNewStr=new String[elements];
        for(int i=0;i<returnStr.length;i++){
        	String w=returnStr[i];
        	if(w!=null){
        		returnNewStr[i]=w;
        	}
        }
        return returnNewStr;
    }
}