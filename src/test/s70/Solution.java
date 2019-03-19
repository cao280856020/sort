package test.s70;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int majorityElement(int[] nums) {
		int result=-1;
		int n=nums.length/2;
		Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        	Integer key=nums[i];
	        Integer value=map.get(key);
	        if(value==null){
	        	value=0;
	        }
	        value=value+1;
	        if(value>n){
	        	return key;
	        }
	        map.put(key, value);
        }
        return result;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={2,2,1,1,1,2,2};
		System.out.println(s.majorityElement(nums));
	}

}
