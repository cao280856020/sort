package test.s46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();
		
		if(nums.length==0){
			return list;
		}else if(nums.length==1){
			List<Integer> subList=new ArrayList<>();
			subList.add(1);
			list.add(subList);
			return list;
		}
		Set<String> set=new HashSet<>();
		
		for(int i=0;i<nums.length;i++){
			
		}
		return list;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={1,2,3,4};
		List<List<Integer>> list=s.permute(nums);
		for(List<Integer> subList:list){
			for(Integer l:subList){
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}
