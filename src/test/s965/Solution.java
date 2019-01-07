package test.s965;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static Set<Integer> s=new HashSet<>();
	
	public static boolean flag=true;
	
    private void check(TreeNode root){
        if(root!=null){
        	
            check(root.left);
            
        	if(s.size()==0){
        		s.add(root.val);
            }else{
                if(s.add(root.val)){
                    flag=false;
                }                
            }
            
            check(root.right);
        }
    }
    
    public boolean isUnivalTree(TreeNode root) {
    	s.clear();
    	flag=true;
    	
        this.check(root);
        return flag;
    }
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(0);
		TreeNode node2=new TreeNode(1);
		TreeNode node3=new TreeNode(1);
		TreeNode node4=new TreeNode(1);
		TreeNode node5=new TreeNode(1);
		TreeNode node6=new TreeNode(1);
//		root.left=node2;
//		node2.left=node3;
//		node3.right=node4;
//		root.right=node5;
//		node5.right=node6;
		
		Solution s=new Solution();
		s.check(root);
	}

}
