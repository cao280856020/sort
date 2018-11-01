package structures.trees;

public class Tree {
	private Node root;
	
	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.left);
			System.out.print(" "+node.key);
			inOrder(node.right);
		}
	}
	
	public void insert(int key){
		Node nNode=new Node(key);
		if(root==null){
			root=nNode;
			return;
		}
		Node cur=root;
		Node parent;
		while(cur!=null){
			parent=cur;
			if(key<cur.key){
				cur=cur.left;
				if(cur==null){
					parent.left=nNode;
				}
			}else{
				cur=cur.right;
				if(cur==null){
					parent.right=nNode;
				}
			}
		}
	}
	
	public Node find(int key){
		if(root==null){
			return null;
		}
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
		Node cur=root;
		Node parent=null;
		boolean isLeft=true;
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
		if(cur==null){
			return;
		}
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
