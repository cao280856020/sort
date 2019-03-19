package test.s876;

public class Solution {
	
	public ListNode middleNode(ListNode head) {
		if(head.next==null){
			return head;
		}
		int count=1;
        ListNode fast=head;
        ListNode cur=head;
        while(fast!=null && fast.next!=null){
        	count+=2;
        	fast=fast.next.next;
        	if(fast==null){
        		count-=1;
        		break;
        	}
        	cur=cur.next;
        }
        if(count%2==0){
        	cur=cur.next;
        }
        return cur;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		
		System.out.println(s.middleNode(l1).val);
		
	}

}
