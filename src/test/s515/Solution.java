package test.s515;

import java.util.ArrayList;
import java.util.List;

import test.s515.TreeNode;

public class Solution {
	
	private static List<TreeNode> subList(List<TreeNode> root,List<Integer> returnList){
		List<TreeNode> list=new ArrayList<>();
		
		int max=Integer.MIN_VALUE;
		boolean update=false;
		for(TreeNode node:root){
			if(node.left!=null){
				list.add(node.left);
				if(node.left.val>=max){
					max=node.left.val;
					update=true;
				}
			}
			if(node.right!=null){
				list.add(node.right);
				if(node.right.val>=max){
					max=node.right.val;
					update=true;
				}
			}
		}
		if(update){
			returnList.add(max);
		}
		return list;
	}
	
	public static List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>(1);
        
        if(root==null){
        	return list;
        }
        list.add(root.val);
        
        List<TreeNode> queryList=new ArrayList<>(1);
        queryList.add(root);
        
        do{
        	queryList=subList(queryList,list);
        }while(queryList.size()>0);
        
        return list;
    }

	
//	 	1
//     / \
//    3   2
//   / \   \  
//  5   3   9 
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode l1=new TreeNode(3);
		TreeNode l2=new TreeNode(2);
		root.left=l1;
		root.right=l2;
		
		TreeNode l3=new TreeNode(5);
		TreeNode l4=new TreeNode(3);
		TreeNode l5=new TreeNode(9);
		l1.left=l3;
		l1.right=l4;
		l2.right=l5;
		
		List<Integer> list=largestValues(root);
		for(Integer i:list){
			System.out.print(i+" ");
		}
	}

}
