package test.s78;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	private final static Map<Integer,String> map=new HashMap<>();

	public List<Integer> reSet(List<String> nums){
		return null;
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> l=new ArrayList<>();
		return l;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={1,2,3};

		List<List<Integer>> list=s.subsets(nums);
		for(List<Integer> l:list){
			for(Integer s1:l){
				System.out.print(" "+s1);
			}
			System.out.println();
		}
	}

}
