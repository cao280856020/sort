package test.s230;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	private void inOrder(TreeNode root,List<Integer> list){
		if(root!=null){
			this.inOrder(root.left,list);
			list.add(root.val);
			this.inOrder(root.right,list);
		}
	}
	
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list=new ArrayList<>();
        this.inOrder(root,list);
		return list.get(k-1);
    }
	
	/*
	  	   3
		  / \
		 1   4
		  \
		   2
	 */
	
	public static void main(String[] args) {
		Solution s=new Solution();
		
		TreeNode head=new TreeNode(3);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node4=new TreeNode(4);
		head.left=node1;
		node1.right=node2;
		head.right=node4;
		
		System.out.println(s.kthSmallest(head,1));
	}

}
