package structures.rbtree;

public class Tree {

	private Node root;
	
	public void insert(int key){
		
		Node n=new Node(key);
		if(root==null){
			root=n;
			return;
		}
		
		Node cur=root;
		Node parent=null;
		while(cur!=null){
			parent=cur;
			if(key<cur.key){
				cur=cur.left;
				if(cur==null){
					parent.left=n;
					break;
				}
			}else{
				cur=cur.right;
				if(cur==null){
					parent.right=n;
					break;
				}
			}
		}
	}
	
	public void inOrder(Node n){
		if(n!=null){
			this.inOrder(n.left);
			System.out.print(" "+n.key);
			this.inOrder(n.right);
		}
	}

	public Node find(int key){
		Node cur=root;
		while(cur.key!=key){
			if(key<cur.key){
				cur=cur.left;
				if(cur==null){
					break;
				}
			}else{
				cur=cur.right;
				if(cur==null){
					break;
				}
			}
		}
		return cur;
	}
	
	public void delete(int key){
		boolean isLeft=true;
		Node parent=null;
		Node cur=root;
		while(cur.key!=key){
			parent=cur;
			if(key<cur.key){
				cur=cur.left;
				isLeft=true;
				if(cur==null){
					break;
				}
			}else{
				cur=cur.right;
				isLeft=false;
				if(cur==null){
					break;
				}
			}
		}
		if(cur==null)return;
		
		if(cur.left==null&&cur.right==null){
			if(root==cur){
				root=null;
			}else if(isLeft){
				parent.left=null;
			}else{
				parent.right=null;
			}
		}else if(cur.left==null){
			if(root==cur){
				root=cur.right;
			}else if(isLeft){
				parent.left=cur.right;
			}else{
				parent.right=cur.right;
			}
		}else if(cur.right==null){
			if(root==cur){
				root=cur.left;
			}else if(isLeft){
				parent.left=cur.left;
			}else{
				parent.right=cur.left;
			}
		}else{
			Node successor=getSuccessor(cur);
			if(root==cur){
				root=successor;
			}else if(isLeft){
				parent.left=successor;
			}else{
				parent.right=successor;
			}
			successor.left=cur.left;
		}
	}
	private Node getSuccessor(Node delNode){
		Node parentSuccessor=delNode;
		Node successor=delNode;
		Node cur=delNode.right;
		while(cur!=null){
			parentSuccessor=successor;
			successor=cur;
			cur=cur.left;
		}
		if(successor!=delNode.right){
			parentSuccessor.left=successor.right;
			successor.right=delNode.right;
		}
		return successor;
	}
}
