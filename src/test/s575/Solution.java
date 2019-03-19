package test.s575;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public int distributeCandies(int[] candies) {
        
        //获得每个人能得到的种类
        int personCount=candies.length/2;
        
        //总共种类
        Set<Integer> sp1=new HashSet<>();
        Set<Integer> sp2=new HashSet<>();
        
        boolean insertFlag=true;
        for(Integer c:candies){
        	//不能加入到这里时加入到sp2
        	if(insertFlag && sp1.add(c)==false){
        		sp2.add(c);
        	}else{
        		//加入成功了
        		if(sp1.size()==personCount){
        			insertFlag=false;
            	}
        	}
        }
		return sp1.size()>sp2.size()?sp1.size():sp2.size();
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] candies={1,1,2,2,3,3};
		System.out.println(s.distributeCandies(candies));
		
		int[] candies2={1,1,2,3};
		System.out.println(s.distributeCandies(candies2));
	}

}
