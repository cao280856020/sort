package structures.tree;

public class Tree {
	private Node root;
	
	public void insert(int iData){
		Node newNode=new Node();
		newNode.iData=iData;
		
		if(root==null){
			root=newNode;
		}else{
			Node current=root;
			Node parent;
			while(true){
				parent=current;
				if(iData<current.iData){
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
	
	public Node find(int iData){
		Node current=root;
		if(current==null){
			return null;
		}
		while(current.iData!=iData){
			if(iData<current.iData){
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
			System.out.print(node.iData+" ");
			inOrder(node.rightChild);
		}
	}
	
	public void preOrder(Node node){
		if(node!=null){
			
			System.out.print(node.iData+" ");
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	
	public void postOrder(Node node){
		if(node!=null){
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.iData+" ");
		}
	}
	
	public boolean findDeleteNode(int iData){
		if(root==null){
			return false;
		}
		
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		while(current.iData!=iData){
			parent=current;
			if(iData<current.iData){
				current=current.leftChild;
				isLeftChild=true;
				if(current==null){
					break;
				}
			}else{
				current=current.rightChild;
				isLeftChild=false;
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
			Node successor=getSuccessor(current);
			if(current==root){
				root=successor;
			}else if(isLeftChild){
				parent.leftChild=successor;
			}else{
				parent.rightChild=successor;
			}
			successor.leftChild=current.leftChild;
		}
		
		return true;
	}
	private Node getSuccessor(Node delNode){
		Node successorParent=delNode;
		Node successor=delNode;
		Node current=delNode.rightChild;
		
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.leftChild;
		}
		if(successor!=delNode.rightChild){
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=delNode.rightChild;
		}
		return successor;
	}
}
