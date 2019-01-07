package test.s678;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public boolean checkValidString(String s) {
		if("".equals(s)){
			return true;
		}
		Pattern p=Pattern.compile("\\*{1,}");
		Matcher m=p.matcher(s);
		if(m.find()){
			return true;
		}
		
		boolean flag=false;
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++){
        	String result=s.charAt(i)+"";
        	if(")".equals(result)){
        		//一直循环取出来
        		if(stack.isEmpty()){
        			return false;
        		}
    			while(stack.peek()!=null){
        			String temp=stack.pop();//取出
        			if(temp.equals("(")||temp.equals("*")){
        				flag=true;
        				break;
        			}
        		}
        	}else{
        		//只让左括号放入栈里面
        		if("(".equals(result) || "*".equals(result)){
        			stack.push(s.charAt(i)+"");
        		}
        	}
        }
        return flag;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		boolean ss=s.checkValidString("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)");
		System.out.println(ss);

	}

}
