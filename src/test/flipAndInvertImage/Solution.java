package test.flipAndInvertImage;

public class Solution {
	
	public int[][] flipAndInvertImage(int[][] A) {
		int[][] newData=new int[A.length][A.length];
        for(int out=0;out<A.length;out++){
        	int i=0;
        	for(int in=A[out].length-1;in>=0;in--){
        		int temp=A[out][in];
        		newData[out][i++]=temp==1?0:1;
        	}
        }
        return newData;
    }

	public static void main(String[] args) {
		
		int[][] A={{1,1,0},{1,0,1},{0,0,0}};
		Solution s=new Solution();
		s.flipAndInvertImage(A);

	}

}
