package structures.trees;

public class Tree {
	Node root;
	public void insert(int key){
		Node nNode=new Node(key);
		if(root==null){
			root=nNode;
			return;
		}
		Node current=root;
		Node parent=null;
		while(current.key!=key){
			parent=current;
			if(key<current.key){
				current=current.leftChild;
				if(current==null){
					parent.leftChild=nNode;
					break;
				}
			}else{
				current=current.rightChild;
				if(current==null){
					parent.rightChild=nNode;
					break;
				}
			}
		}
	}
	public Node find(int key){
		Node current=root;
		while(current.key!=key){
			if(key<current.key){
				current=current.leftChild;
				if(current==null){
					break;
				}
			}else{
				current=current.rightChild;
				if(current==null){
					break;
				}
			}
		}
		return current;
	}
	public Node getSuccessor(Node delNode){
		Node parentSuccessor=delNode;
		Node successor=delNode;
		Node current=delNode.rightChild;
		while(current!=null){
			parentSuccessor=successor;
			successor=current;
			current=current.leftChild;
		}
		if(successor!=delNode.rightChild){
			parentSuccessor.leftChild=successor.rightChild;
			successor.rightChild=delNode.rightChild;
		}
		return successor;
	}
	public void delete(int key){
		Node current=root;
		Node parent=null;
		boolean isLeftChild=true;
		while(current.key!=key){
			parent=current;
			if(key<current.key){
				current=current.leftChild;
				isLeftChild=true;
				if(current==null){
					return;
				}
			}else{
				current=current.rightChild;
				isLeftChild=false;
				if(current==null){
					return;
				}
			}
		}
		if(current.leftChild==null&&current.rightChild==null){
			if(root==current){
				root=null;
			}else if(isLeftChild){
				parent.leftChild=null;
			}else{
				parent.rightChild=null;
			}
		}else if(current.leftChild==null){
			if(root==current){
				root=current.rightChild;
			}else if(isLeftChild){
				parent.leftChild=current.rightChild;
			}else{
				parent.rightChild=current.rightChild;
			}
		}else if(current.rightChild==null){
			if(root==current){
				root=current.leftChild;
			}else if(isLeftChild){
				parent.leftChild=current.leftChild;
			}else{
				parent.rightChild=current.leftChild;
			}
		}else{
			Node successor=getSuccessor(current);
			if(root==current){
				root=successor;
			}else if(isLeftChild){
				parent.leftChild=successor;
			}else{
				parent.rightChild=successor;
			}
			successor.leftChild=current.leftChild;
		}
	}
	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.leftChild);
			System.out.print(" "+node.key);
			inOrder(node.rightChild);
		}
	}
}
