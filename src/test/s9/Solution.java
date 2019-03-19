package test.s9;

public class Solution {
	
	public boolean isPalindrome(int x) {
		if(x<0 || (x%10==0 && x!=0)){
			return false;
		}else if(x<10){
			return true;
		}else{
			int reverseNum=0;
			while(x>reverseNum){
				reverseNum=reverseNum*10+x%10;
				x/=10;
			}
			return x==reverseNum || reverseNum/10==x;
		}
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isPalindrome(1410110141));
		
		
	}

}
