package test.s27;

public  class Solution {

	public  static int removeElement(int[] nums, int val) {
		int lastIndex=nums.length;
        for(int i=0;i<nums.length;i++){
        	int temp=nums[i];
        	if(temp==val){
        		//比较一下倒数的 ，直到找到不为该数的，为了交换位置
        		while(--lastIndex>=0 && nums[lastIndex]==val);
        		if(lastIndex<=i){
        			break;
        		}
        		if(lastIndex>0){
        			int changeValue=nums[lastIndex];
            		nums[lastIndex]=temp;
            		nums[i]=changeValue;
        		}else{
        			break;
        		}
        	}
        }
        return lastIndex+1;
    }
	
	public static void main(String[] args){
		int[] nums={3,2,2,3};
		System.out.println(removeElement(nums,3));
	}
}
