package test.s441;

public class Solution {
	
	public int arrangeCoins(int n) {
		long result=0;
		long remain=n;
		long n1=n;
        for(long i=1;i<n1+1;i++){
        	if(remain>=i){
        		remain-=i;
        		result=i;
        	}else{
        		break;
        	}
        }
        return (int)result;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.arrangeCoins(1));
	}

}
