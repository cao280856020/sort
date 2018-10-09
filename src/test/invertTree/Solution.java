package test.invertTree;

public class Solution {
	
    public TreeNode invertTree(TreeNode root) {
    	if(root==null){
			return null;
		}
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		invertTree(root.left);
		invertTree(root.right);
        return root;
    }
	
	public static void main(String[] args) {
		TreeNode newNode3=new TreeNode(3);
		TreeNode newNode1=new TreeNode(1);
		TreeNode newNode2=new TreeNode(2);
		
		TreeNode newNode=new TreeNode(4);
		newNode.left=newNode2;
		newNode2.left=newNode1;
		newNode2.right=newNode3;
		
		TreeNode newNode7=new TreeNode(7);
		TreeNode newNode6=new TreeNode(6);
		TreeNode newNode9=new TreeNode(9);
		
		newNode.right=newNode7;
		newNode7.left=newNode6;
		newNode7.right=newNode9;
		
		Solution s= new Solution();
		TreeNode newN=s.invertTree(newNode);
		
		System.out.println(newN);
	}

}
