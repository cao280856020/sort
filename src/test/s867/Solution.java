package test.s867;

public class Solution {

	public int[][] transpose(int[][] A) {
	   if(A.length==0){
		   return new int[0][0];
	   }
	   int[] zeroData=A[0];
		
	   int[][] result=new int[zeroData.length][A.length];
	   
	   for(int i=0;i<A.length;i++){
		   
		   int[] inner=A[i];
		   
		   for(int in=0;in<inner.length;in++){
			  result[i][in]=A[in][i]; 
		   }
		   
	   }
	   
	   return result;
	}
	
	public static void main(String[] args) {
		int[][] A={{1,2,3},{4,5,6}};//--14 25 36
		Solution s=new Solution();
		int[][] a=s.transpose(A);
//		for(int j:a){
			System.out.print(a);
//		}
	}

}
