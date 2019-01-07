package test.s961;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int repeatedNTimes(int[] A) {
		int result = 0;
		if(A.length==0 || A.length==1){
			return result;
		}
		
		int n=A.length/2;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<A.length;i++){
			if(map.containsKey(A[i])){
				map.put(A[i], map.get(A[i])+1);
			}else{
				map.put(A[i], 1);
			}
			if(n==map.get(A[i])){
				result=A[i];
				break;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] A={5,1,5,2,5,3,5,4};
		System.out.println(s.repeatedNTimes(A));

	}

}
