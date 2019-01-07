package test.s349;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums1.length==0){
            return new int[0];
        }
        Set<Integer> s1=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        
        Set<Integer> s2=new HashSet<>();
        for(int i:nums2){
            s2.add(i);
        }
        
        Set<Integer> filterSet=new HashSet<>();
        
        int index=0;
        for(int i:s2){
            if(s1.add(i)==false){
                filterSet.add(i);
            }
        }
        int[] intersection=new int[filterSet.size()];
        for(Integer j:filterSet){
            intersection[index++]=j;
        }
        return intersection;
    }
	
	public static void main(String[] args) {
		int[] nums1={4,7,9,7,6,7};
		int[] nums2={5,0,0,6,1,6,2,2,4};
		Solution s=new Solution();
		int[] a=s.intersection(nums1, nums2);
		for(int j:a){
			System.out.print(j+" ");
		}
	}

}
