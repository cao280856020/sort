package test.generate;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static final int NUM=1;
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		if(numRows>0){
			for(int i=0;i<numRows;i++){
				List<Integer> l=new ArrayList<Integer>();
				int length=i+1;
				for(int j=0;j<length;j++){
					if(j==0 || j==length-1){
						l.add(NUM);
					}else{
						int l1=list.get(i-1).get(j-1);
						int l2=list.get(i-1).get(j);
						l.add(l1+l2);
					}
				}
				list.add(l);
			}
		}
		return list;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		List<List<Integer>> list=s.generate(5);
		for(List<Integer> l:list){
			System.out.println();
			for(Integer l2:l){
				System.out.print(" "+l2);
			}
		}
	}

}
