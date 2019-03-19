package test.s338;

public class Solution {
	
	public int[] countBits(int num) {
        int[] count=new int[num+1];
        for(int i=0;i<num+1;i++){
        	if(i==0){
        		continue;
        	}
        	count[i]=count[i&(i-1)]+1;
        }
        return count;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int n=5;
		int[] count=s.countBits(n);
		for(int c:count){
			System.out.print(" "+c);
		}
	}

}
