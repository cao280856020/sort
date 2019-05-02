package test.s203;

public class Solution {

	public static ListNode removeElements(ListNode head, int val) {
		if(head!=null && head.val==val){
			head=head.next;
		}
		ListNode pre=head;
		if(pre!=null){
			while(pre.next!=null){
				if(pre.next.val==val){
					pre.next=pre.next.next;
				}else{
					pre=pre.next;
				}
			}
		}
		return head;
	}
	
	//1->2->6->3->4->5->6
	public static void main(String[] args){
		ListNode r5=new ListNode(1);
		ListNode r4=new ListNode(2);
		ListNode r3=new ListNode(6);
		ListNode r2=new ListNode(3);
		ListNode r1=new ListNode(4);
		ListNode r0=new ListNode(5);
		ListNode r_1=new ListNode(6);
		r5.next=r4;
		r4.next=r3;
		r3.next=r2;
		r2.next=r1;
		r1.next=r0;
		r0.next=r_1;
		ListNode node=removeElements(r5,1);
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
}
