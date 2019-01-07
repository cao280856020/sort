package test.maxDepth;

public class Solution {
	
	private void leftOrder(TreeNode node){
		if(node!=null){
			System.out.print(" "+node.val);
			this.leftOrder(node.left);
		}
	}
	
	private void rightOrder(TreeNode node){
		if(node!=null){
			System.out.print(" "+node.val);
			this.rightOrder(node.right);
		}
	}
	
	 public int maxDepth(TreeNode root) {
	        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	    }
    
    /*
     *      3
		   / \
		  9  20
		    /  \
		   15   7
     */
    public static void main(String[] args){
    	
    	Long j=System.currentTimeMillis()/1000;
    	System.out.println(j);
    	System.out.println((20-1)*10000000000L+j);
    	System.out.println((20-5)*10000000000L+j);
    	System.out.println((20-20)*10000000000L+j);
    	System.out.println((20-19)*10000000000L+j);
    	System.out.println((20-18)*10000000000L+j);
    	System.out.println((20-17)*10000000000L+j);
    	
    	Solution s=new Solution();
    	TreeNode root=new TreeNode(3);
    	root.left=new TreeNode(9);
    	
    	TreeNode l1=new TreeNode(20);
    	l1.left=new TreeNode(15);
    	l1.right=new TreeNode(7);
    	
    	root.right=l1;
    	
    	
    	System.out.println(s.maxDepth(root));
    	
    }
}
