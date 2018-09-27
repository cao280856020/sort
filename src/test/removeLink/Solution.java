package test.removeLink;

public class Solution {
	
	ListNode head;

	public void deleteNode(ListNode node) {
        ListNode pre=head;
        ListNode current=head;
        while(current.val!=node.val){
        	pre=current;
        	current=current.next;
        }
        pre.next=current.next;
    }
	
	public static void main(String[] args) {
		//4519
		ListNode l1=new ListNode(4);
		ListNode l2=new ListNode(5);
		ListNode l3=new ListNode(1);
		ListNode l4=new ListNode(9);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		
		Solution s=new Solution();
		s.head=l1;
		
		s.deleteNode(l3);
	}

}
