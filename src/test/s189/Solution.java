package test.s189;

public class Solution {

	public void rotate(int[] nums, int k) {
		int last=nums.length-1;
        
        while(k>0){
        	--k;
        	
        	int temp=nums[last];
        	
        	for(int i=last-1;i>=0;i--){
        		nums[i+1]=nums[i];
        	}
        	nums[0]=temp;
        }
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={1,2,3,4};
		int k=2;
		s.rotate(nums,k);
		
		for(int a:nums){
			System.out.print(" "+a);
		}
	}

}
