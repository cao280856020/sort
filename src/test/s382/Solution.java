package test.s382;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
	
	private Map<Integer,Integer> map=new HashMap<>();
	
	private int index=0;
	
	private ListNode head;
	
	public Solution(ListNode head) {
		this.head = head;
//        while(head!=null){
//        	int value=head.val;
//        	map.put(index++, value);
//        	head=head.next;
//        }
    }
    
    /** Returns a random node's value. */
    public int getRandombak() {
    	int key=(int)(1+Math.random()*index);
        return map.get(key-1);
    }
	
    public int getRandom() {
	    int res = head.val;
	    ListNode no = head.next;
	    int i = 2;
	    Random random = new Random();
	    while(no!=null){
	    	int rId=random.nextInt(i);
	        if(rId == 0){
	            res = no.val;
	        }
	        i++;
	        no = no.next;
	    }
	    return res;
    }
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode r1=new ListNode(2);
		ListNode r2=new ListNode(3);
		head.next=r1;
		r1.next=r2;
		Solution s=new Solution(head);
		int j=s.getRandom();
		Random random = new Random();
		System.out.println(random.nextInt(3));
		
//		key=2 index=3
		
	}

}
