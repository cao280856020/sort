package test.s234;

import java.util.Stack;

public class Solution {
	
	private Stack<Integer> stack=new Stack<>();

	public boolean isPalindrome(ListNode head) {
		ListNode cur=head;
		int count=0;
		while(cur!=null){
			//比较一下
			if(!stack.isEmpty()){
				if(cur.val==stack.peek()){
					stack.pop();
					cur=cur.next;
					count++;
					continue;
				}
			}
			count++;
			stack.push(cur.val);
			cur=cur.next;
		}
		if(stack.isEmpty()){
			return true;
		}else{
			if(count==1){
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		ListNode head = new ListNode(1);
		ListNode r1 = new ListNode(2);
		ListNode r2 = new ListNode(2);
		ListNode r3 = new ListNode(1);
//		head.next = r1;
//		r1.next = r2;
//		r2.next = r3;

		boolean flag = s.isPalindrome(head);
		System.out.println(flag);

	}

}
