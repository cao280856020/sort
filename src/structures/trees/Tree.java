package structures.trees;

public class Tree {
	
	private Node root;
	
	public void insert(int key){
		Node newNode=new Node();
		newNode.key=key;
		
		if(root==null){
			root=newNode;
		}else{
			Node current=root;
			Node parent;
			while(current.key!=key){
				parent=current;
				if(key<current.key){
					current=current.leftChild;
					if(current==null){
						parent.leftChild=newNode;
						break;
					}
				}else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						break;
					}
				}
			}
		}
	}
	
	public Node find(int key){
		if(root==null){
			return null;
		}
		
		Node current=root;
		while(current.key!=key){
			if(key<current.key){
				current=current.leftChild;
				if(current==null){
					return null;
				}
			}else{
				current=current.rightChild;
				if(current==null){
					return null;
				}
			}
		}
		
		return current;
		
	}
	
	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.leftChild);
			System.out.print(node.key+" ");
			inOrder(node.rightChild);
		}
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
	
	public boolean delete(int key){
		if(root==null){
			return false;
		}
		boolean isLeftChild=true;
		Node current=root;
		Node parent = null;
		while(current.key!=key){
			parent=current;
			if(key<current.key){
				isLeftChild=true;
				current=current.leftChild;
				if(current==null){
					break;
				}
			}else{
				isLeftChild=false;
				current=current.rightChild;
				if(current==null){
					break;
				}
			}
		}
		if(current==null){
			return false;
		}
		if(current.leftChild==null && current.rightChild==null){
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
			Node delNode=getSuccessor(current);
			if(current==delNode){
				root=delNode;
			}else if(isLeftChild){
				parent.leftChild=delNode;
			}else{
				parent.rightChild=delNode;
			}
			delNode.leftChild=current.leftChild;
		}
		
		return true;
	}
}
