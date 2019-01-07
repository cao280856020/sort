package test.s575;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public int distributeCandies(int[] candies) {
        int result=0;
        
        //获得每个人能得到的种类
        int partition=candies.length/2;
        
        //总共种类
        Set<Integer> sp=new HashSet<>();
        for(Integer c:candies){
        	sp.add(c);
        }
        int specialCount=sp.size();
        
        result=specialCount/partition;
        
		return result;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] candies={1,1,2,2,3,3};
		System.out.print(s.distributeCandies(candies));
		
		int[] candies2={1,1,2,3};
		System.out.print(s.distributeCandies(candies2));
	}

}
