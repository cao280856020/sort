package test.s141;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public boolean hasCycle(ListNode head) {
        Set<ListNode> s=new HashSet<>();
        while(head!=null){
        	if(!s.add(head)){
        		return true;
        	}
        	head=head.next;
        }
        return false;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		
		ListNode head=new ListNode(3);
		ListNode r1=new ListNode(2);
		ListNode r2=new ListNode(0);
		ListNode r3=new ListNode(-4);
		head.next=r1;
		r1.next=r2;
		r2.next=r3;
		r3.next=r1;
//		3,2,0,-4
		
		System.out.println(s.hasCycle(head));
	}

}
