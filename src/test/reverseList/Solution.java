package test.reverseList;

public class Solution {
	
	public ListNode reverseList(ListNode head) {
		if(head==null)
			return head;
		ListNode pre,cur,temp;
        pre=head;
        cur=head.next;
        while(cur!=null){
        	temp=cur.next;
        	cur.next=pre;
        	pre=cur;
        	cur=temp;
        }
        head.next=null;
        return pre;
    }

	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		ListNode n=l1;
		while(n!=null){
			System.out.print(" "+n.val);
			n=n.next;
		}
		Solution s=new Solution();
		ListNode head=s.reverseList(l1);
		
		System.out.println();
		
		while(head!=null){
			System.out.print(" "+head.val);
			head=head.next;
		}
	}

}
