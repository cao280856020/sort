package test.s109;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
//	输入
//	[-10,-3,0,5,9]
//	输出
//	[0,-3,9,-10,null,5]
//	差别
//	预期结果
//	[0,-10,5,null,-3,null,9]
	
	/*    0  
	   -3   9
	 -10   5
	        0
	    -10   5
	           
	*/
	
	
//	[0,1,2,3,4,5]
//	输出
//	[3,0,4,null,1,null,5,null,2]
//	预期结果
//	[3,1,5,0,2,4]
	
	private void insert(TreeNode node,int v){
		TreeNode cur=node;
		TreeNode parent=null;
		TreeNode newNode=new TreeNode(v);
		while(cur!=null){
			parent=cur;
			if(v<cur.val){
				cur=cur.left;
				if(cur==null){
					parent.left=newNode;
				}
			}else{
				cur=cur.right;
				if(cur==null){
					parent.right=newNode;
				}
			}
		}
	}

	public TreeNode sortedListToBST(ListNode head) {
		
		List<Integer> leftList=new ArrayList<>();
		List<Integer> rightList=new ArrayList<>();
		
		TreeNode root=null;
		
		List<Integer> allList=new ArrayList<>();
		
		while(head!=null){
			allList.add(head.val);
			head=head.next;
		}
		
		int midIndex=allList.size()/2;
		for(int i=0;i<allList.size();i++){
			if(midIndex==i){
				root=new TreeNode(allList.get(i));
			}else if(midIndex<i){
				rightList.add(allList.get(i));
			}else if(midIndex>i){
				leftList.add(allList.get(i));
			}
		}
		
//		for(int i=leftList.size()-1;i>=0;i--){
//			this.insert(root, leftList.get(i));
//		}
//		
//		for(int i=rightList.size()-1;i>=0;i--){
//			this.insert(root, rightList.get(i));
//		}
		
		for(int i=0;i<leftList.size();i++){
			this.insert(root, leftList.get(i));
		}
		
		for(int i=0;i<rightList.size();i++){
			this.insert(root, rightList.get(i));
		}
		
        return root;
    }
	
	
	public static void main(String[] args) {
		Solution s=new Solution();
//		[-10, -3, 0, 5, 9]
		ListNode head1=new ListNode(-10);
		ListNode head2=new ListNode(-3);
		ListNode head3=new ListNode(0);
		ListNode head4=new ListNode(5);
		ListNode head5=new ListNode(9);
		head4.next=head5;
		head3.next=head4;
		head2.next=head3;
		head1.next=head2;
		s.sortedListToBST(head1);
	}

}
