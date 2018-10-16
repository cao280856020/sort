package test.singleNumber;

public class Solution {
	public int singleNumber(int[] nums) {
        int c=-1;
        for(int i=0;i<nums.length;i++){
        	int count=0;
        	for(int j=0;j<nums.length;j++){
        		if(nums[i]==nums[j]){
        			++count;
        		}
        		if(count>1){
        			break;
        		}
        	}
        	if(count==1){
        		c=nums[i];
        	}
        }
        return c;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={4,1,2,1,2};
		System.out.println(s.singleNumber(nums));
	}

}
