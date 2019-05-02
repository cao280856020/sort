package test.s206;

public class Solution {

	public static ListNode reverseList(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}
		ListNode pre=head;
		ListNode cur=head.next;
		while(cur!=null){
			ListNode temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		head.next=null;
		return pre;
	}
	
	public static void main(String[] args){
		ListNode r5=new ListNode(5);
		ListNode r4=new ListNode(4);
		ListNode r3=new ListNode(3);
		ListNode r2=new ListNode(2);
		ListNode r1=new ListNode(1);
		r5.next=r4;
		r4.next=r3;
//		r3.next=r2;
//		r2.next=r1;
		ListNode node=reverseList(r5);
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
}
