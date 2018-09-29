package structures.tree;

public class Tree {

	private Node root;
	
	public void insert(int key){
		Node newNode=new Node(key);
		if(root==null){
			root=newNode;
		}else{
			Node parent=null;
			Node current=root;
			while(current.getKey()!=key){
				parent=current;
				if(key<current.getKey()){
					current=current.getLeftChild();
					if(current==null){
						parent.setLeftChild(newNode);
						break;
					}
				}else{
					current=current.getRightChild();
					if(current==null){
						parent.setRightChild(newNode);
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
		while(current.getKey()!=key){
			if(key<current.getKey()){
				current=current.getLeftChild();
				if(current==null){
					return null;
				}
			}else{
				current=current.getRightChild();
				if(current==null){
					return null;
				}
			}
		}
		return current;
	}
	
	public void inOrder(Node node){
		if(node!=null){
			this.inOrder(node.getLeftChild());
			System.out.print(node.getKey()+" ");
			this.inOrder(node.getRightChild());
		}
	}
	
	public void delete(int key){
		if(root==null){
			return;
		}
		Node parent=null;
		boolean isLeft=true;
		Node current=root;
		while(current.getKey()!=key){
			parent=current;
			if(key<current.getKey()){
				current=current.getLeftChild();
				isLeft=true;
				if(current==null){
					break;
				}
			}else{
				current=current.getRightChild();
				isLeft=false;
				if(current==null){
					break;
				}
			}
		}
		if(current==null){
			return;
		}
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(root==current){
				root=null;
			}else if(isLeft){
				parent.setLeftChild(null);
			}else{
				parent.setRightChild(null);
			}
		}else if(current.getLeftChild()==null){
			if(root==current){
				root=current.getRightChild();
			}else if(isLeft){
				parent.setLeftChild(current.getRightChild());
			}else{
				parent.setRightChild(current.getRightChild());
			}
		}else if(current.getRightChild()==null){
			if(root==current){
				root=current.getLeftChild();
			}else if(isLeft){
				parent.setLeftChild(current.getLeftChild());
			}else{
				parent.setRightChild(current.getLeftChild());
			}
		}else{
			Node successor=getSuccessor(current);
			if(root==current){
				root=successor;
			}else if(isLeft){
				parent.setLeftChild(successor);
			}else{
				parent.setRightChild(successor);
			}
			successor.setLeftChild(current.getLeftChild());
			
		}
	}
	private Node getSuccessor(Node delNode){
		Node parentSuccessor=delNode;
		Node successor=delNode;
		Node current=delNode.getRightChild();
		while(current!=null){
			parentSuccessor=successor;
			successor=current;
			current=current.getLeftChild();
		}
		if(successor!=delNode.getRightChild()){
			parentSuccessor.setLeftChild(successor.getRightChild());
			successor.setRightChild(delNode.getRightChild());
		}
		return successor;
	}
}
