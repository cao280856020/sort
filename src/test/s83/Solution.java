package test.s83;

public class Solution {

	public static ListNode deleteDuplicates(ListNode head) {
		
        ListNode pre=head;
        if(pre!=null){
        	while(pre.next!=null){
    			if(pre.next.val==pre.val){
    				pre.next=pre.next.next;
    			}else{
    				pre=pre.next;
    			}
    		}
        }
    	
    	
        return head;
    }
	
	public static void main(String[] args) {
		ListNode root=new ListNode(1);
		ListNode r1=new ListNode(1);
		ListNode r2=new ListNode(2);
		ListNode r3=new ListNode(3);
		ListNode r4=new ListNode(3);
		root.next=r1;
		r1.next=r2;
		r2.next=r3;
		r3.next=r4;
		
		ListNode c=deleteDuplicates(root);
		while(c!=null){
			System.out.println(c.val);
			c=c.next;
		}
	}

}
