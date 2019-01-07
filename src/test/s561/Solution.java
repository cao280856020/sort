package test.s561;

import java.util.Arrays;

public class Solution {

	public int arrayPairSum(int[] nums) {
		int result=0;
		
        if(nums.length==0){
        	return 0;
        }
        //计算分组
        int n=nums.length/2;
        //计算每组有多少数据
        int dataLength=nums.length/n;
        //排好序
        Arrays.sort(nums);
        //记录nums的索引位置
        int dex=0;
        for(int i=0;i<n;i++){//循环每个分组
        	int min=nums[dex];
        	dex+=dataLength;
        	result+=min;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={1,4,3,2};
		System.out.print(s.arrayPairSum(nums));
	}

}
