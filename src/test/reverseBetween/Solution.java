package test.reverseBetween;

public class Solution {
	
	public ListNode reverseBetween(ListNode head,int m,int n) {
		if(head==null)
			return head;
		ListNode newData=head;
		ListNode reverseData=head;
		int i=0;
		while(head!=null){
			int temp=++i;
			if(m<=temp && temp<=n){
				reverseData=head;
			}
			head=head.next;
			reverseData=reverseData.next;
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
		int m=2,n=4;
		ListNode n1=l1;
		while(n1!=null){
			System.out.print(" "+n1.val);
			n1=n1.next;
		}
		Solution s=new Solution();
		ListNode head=s.reverseBetween(l1,m,n);
		
		System.out.println();
		
		while(head!=null){
			System.out.print(" "+head.val);
			head=head.next;
		}
	}

}
