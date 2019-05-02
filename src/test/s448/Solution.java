package test.s448;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        
        int min=-1;
        int max=-1;
        Set<Integer> sets=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
        	int temp=nums[i];
        	if(temp<min){
        		min=temp;
        	}
        	if(temp>max){
        		max=temp;
        	}
        	if(!sets.add(temp)){
        		
        	}
        }
        
        return list;
    }
	
	public static void main(String[] args) {
		int a[]={4,3,2,7,8,2,3,1};
		List<Integer> list=findDisappearedNumbers(a);
		for(Integer i:list){
			System.out.println(i);
		}
	}

}
