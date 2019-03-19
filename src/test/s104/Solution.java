package test.s104;

public class Solution {
	
	private static int n;
	
	private void order(TreeNode node,int deep){
		if(node!=null){
			++deep;
			order(node.left,deep);
			if(n<deep){
				n=deep;
			}
			order(node.right,deep);
		}
	}
	
	public int maxDepth(TreeNode root) {
		n=0;
		this.order(root,0);
        return n;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		TreeNode root=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		
		root.right=node1;
		System.out.println(s.maxDepth(root));
	}

}
