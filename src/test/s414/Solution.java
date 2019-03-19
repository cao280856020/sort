package test.s414;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	
	public int thirdMax(int[] nums) {
		int max=-1;
		Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
        	int number=nums[i];
        	set.add(number);
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
        	max=it.next();
        }
        return max;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={1,2};
		System.out.println(s.thirdMax(nums));
	}

}
