package test.s938;

public class Solution {

	private static int result=0;
	
	private void preOrder(TreeNode root,int L,int R){
		if(root!=null){
			preOrder(root.left,L,R);
			if(root.val>=L && root.val<=R){
				result+=root.val;
			}
			preOrder(root.right,L,R);
		}
	}
	
//	public int rangeSumBST(TreeNode root, int L, int R) {
//        
//    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		TreeNode r1=new TreeNode(5);
		TreeNode r2=new TreeNode(15);
		TreeNode r3=new TreeNode(3);
		TreeNode r4=new TreeNode(7);
		
		TreeNode r5=new TreeNode(13);
		TreeNode r6=new TreeNode(18);
		
		root.left=r1;
		root.right=r2;
		r1.left=r3;
		r1.right=r4;
				
		r2.left=r5;
		r2.right=r6;
		Solution s=new Solution();
		s.preOrder(root,6,10);
		System.out.println(result);
	}

}
