package test.s442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -nums[index];
            if (nums[index] > 0) {
                result.add(index + 1);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int a[]={4,3,2,7,8,2,3,1};
		List<Integer> list=findDuplicates(a);
		for(Integer i:list){
			System.out.println(i);
		}
	}

}
