package test.s705;

public class MyHashSet {
	
	private class Node{
		public Node next;
		public int val;
		
		public Node(int key){
			this.val=key;
		}
	}
	
	private Node root;

    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
    	Node nNode=new Node(key);
        if(root==null){
        	root=nNode;
        }else{
        	Node cur=root;
        	Node parent=null;
        	while(cur!=null){
        		parent=cur;
        		if(key==cur.val){
        			return;
        		}
        		cur=cur.next;
        	}
        	parent.next=nNode;
        }
    }
    
    public void remove(int key) {
    	if(root==null){
        	return;
        }else{
        	Node cur=root;
        	Node parent=null;
        	while(cur!=null){
        		if(cur.val==key){
        			if(parent==null){
        				root=cur.next;
        			}else{
        				parent.next=cur.next;
        			}
        			return;
        		}
        		parent=cur;
        		cur=cur.next;
        	}
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(root==null){
        	return false;
        }else{
        	Node cur=root;
        	while(cur!=null){
        		if(cur.val==key){
        			return true;
        		}
        		cur=cur.next;
        	}
        	return false;
        }
    }
}
