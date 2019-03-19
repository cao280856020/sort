package test.s108;

public class Solution {

//	   0
//    / \
//  -3   9
//  /   /
//-10  5
	public TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }
	
	public int fib(int N) {
        if (N==0) {
            return 0;
        }
        if (N==1) {
            return 1;
        }
        int[] f = new int[N+1];
        f[0] = 0;
        f[1] = 1;
        for (int i=2;i<=N;i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[N];
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={-10,-3,0,5,9};
		
		int N=3;
		
		System.out.println(s.fib(N));
	}

}
