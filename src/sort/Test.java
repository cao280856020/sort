package sort;

import java.util.HashMap;
import java.util.Map;

public class Test {

	private static void print(Node root){
		Node cur=root;
		while(cur!=null){
			System.out.print(" "+cur.val);
			cur=cur.next;
		}
	}
	
	public static void reverse(Node root){
		Node pre=null;
		Node cur=root;
		while(cur!=null){
			Node temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		print(pre);
	}
	
	public static void main(String[] args) {
		Node root=new Node(1);
		
		Node node2=new Node(2);
		
		Node node3=new Node(3);
		
		Node node4=new Node(4);
		
		Node node5=new Node(5);
		
		root.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		print(root);
		
		System.out.println();
		
		reverse(root);
		
	}

}
