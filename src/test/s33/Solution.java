package test.s33;

public class Solution {
	
	
	private int j=-1;
	
	private int half(int left,int right,int[] nums,int target){
		int result=-1;
		if(left==right){
			int temp=nums[right];
			if(temp==target){
				j=right;
				return right;
			}
			return result;
		}
		int c=(left+right)/2;
		int temp=nums[c];
		if(temp==target){
			j=c;
			return c;
		}
		this.half(left, c, nums, target);
		this.half(c+1, right, nums, target);
		
		return result; 
	}
	
	public int search(int[] nums, int target) {
		if(nums.length==0){
			return -1;
		}
        int left=0;
        int right=nums.length-1;

		this.half(left,right, nums, target);
		
        return j;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		
		int[] nums={4,5,6,7,0,1,2};
		
		
		System.out.println(s.search(nums, 3));
	}

}
