package test.s908;

public class Solution {

	public int smallestRangeI(int[] A, int K) {
        if(A.length==0){
        	return 0;
        }
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++){
        	int result=A[i];
        	if(i==0||i==A.length-1){
        		if(A[i]>K){
            		result=A[i]-K;
            	}else{
            		result=K-A[i];
            	}
        	}
        	B[i]=result;
        }
        return B[B.length-1]-B[0];
    }
	
	public static void main(String[] args) {
		int[] A={1,3,6};
		int K = 3;
		Solution s=new Solution();
		int a=s.smallestRangeI(A,K);
		System.out.print(a);
	}

}
