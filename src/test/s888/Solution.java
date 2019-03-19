package test.s888;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	public int[] fairCandySwap(int[] A, int[] B) {
		int aSum=0;
		int bSum=0;
		
		Set<Integer> bSet=new HashSet<>();
		
		for(int a:A){
			aSum+=a;
		}
		for(int b:B){
			bSum+=b;
		}
		
		int sub=(bSum-aSum)/2;
		
		for(int e:B){
			bSet.add(e);
		}
		
		for(int x:A){
			if(bSet.contains(x+sub)){
				return new int[]{x,x+sub};
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		Solution s=new Solution();
		//5,4
		int[] A = {1,2,5}, B = {2,4};
		int[] r=s.fairCandySwap(A, B);
		System.out.print(r[0]+"   "+r[1]);
		//8    6
	}

}
