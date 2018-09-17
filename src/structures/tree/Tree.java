package structures.tree;

public class Tree {

	private Node root;
	
	public void insert(int key){
		Node newNode=new Node(key);
		if(root==null){
			root=newNode;
			return;
		}
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
	
	public void inOrder(Node root){
		if(root!=null){
			this.inOrder(root.getLeftChild());
			System.out.print(root.getKey()+" ");
			this.inOrder(root.getRightChild());
		}
	}
	
	public boolean delete(int key){
		if(root==null){
			return false;
		}
		Node parent=null;
		Node current=root;
		boolean isLeftChild=true;
		while(current.getKey()!=key){
			parent=current;
			if(key<current.getKey()){
				current=current.getLeftChild();
				isLeftChild=true;
				if(current==null){
					break;
				}
			}else{
				current=current.getRightChild();
				isLeftChild=false;
				if(current==null){
					break;
				}
			}
		}
		if(current==null){
			return false;
		}
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(root==current){
				root=null;
			}else if(isLeftChild){
				parent.setLeftChild(null);
			}else {
				parent.setRightChild(null);
			}
		}else if(current.getLeftChild()==null){
			if(root==current){
				root=current.getRightChild();
			}else if(isLeftChild){
				parent.setLeftChild(current.getRightChild());
			}else {
				parent.setRightChild(current.getRightChild());
			}
		}else if(current.getRightChild()==null){
			if(root==current){
				root=current.getLeftChild();
			}else if(isLeftChild){
				parent.setLeftChild(current.getLeftChild());
			}else {
				parent.setRightChild(current.getLeftChild());
			}
		}else{
			Node successor=getSuccessor(current);
			if(root==current){
				root=successor;
			}else if(isLeftChild){
				parent.setLeftChild(successor);
			}else {
				parent.setRightChild(successor);
			}
			successor.setLeftChild(current.getLeftChild());
		}
		
		return true;
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
