package test.s148;

public class Solution {
	
	private void change(ListNode head,ListNode next,ListNode next2){
		if(next==null||next2==null){
			return;
		}
		if(next.val<next2.val){
			return;
		}
		ListNode temp=next2.next;
		next2.next=next;
		next.next=temp;
		head=next2;
	}

	public ListNode sortList(ListNode head) {
		ListNode cur=head;
		ListNode pre=head;
		while(cur!=null){
			
			ListNode next=cur.next;
			while(next!=null){
				if(cur.val>next.val){
					change(pre,cur,next);
				}
				next=next.next;
			}
			
			
			cur=cur.next;
		}
        return head;
    }
	
	public void reverse(ListNode c){
		if(c!=null){
			reverse(c.next);
			System.out.print(c.val);
		}
	}
	
	public static void main(String[] args) {
		Solution s=new Solution();
		
		ListNode head=new ListNode(4);
		ListNode r1=new ListNode(2);
		ListNode r2=new ListNode(1);
		ListNode r3=new ListNode(3);
		head.next=r1;
		r1.next=r2;
		r2.next=r3;
//		4213
		
		s.reverse(head);
		
//		ListNode pre=s.sortList(head);
//		while(pre!=null){
//			System.out.print(" "+pre.val);
//			pre=pre.next;
//		}
		
	}

}
