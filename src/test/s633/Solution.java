package test.s633;

public class Solution {
	
	public boolean judgeSquareSum(int c) {
		Double end=Math.ceil(Math.sqrt(c));
		long endLength=end.longValue();
		if(endLength==0L){
			return true;
		}
		for(long i=endLength-1;i>=0;i--){
			long sum=i*i;
			
			long low = 0;
	        long high = endLength;
	        while(low <= high)
	        {
	            long middle = (low + high) / 2;
	            long newSum=sum+middle*middle;
	            if(c == newSum) {
	                return true;
	            }
	            if(c > newSum) {
	                low = middle + 1;
	            }else{
	                high = middle - 1;
	            }
	        }
		}
        return false;
    }
	

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.judgeSquareSum(1));
											
		System.out.println(s.judgeSquareSum(2098862653));
	}

}
