package structures.tree;

public class Tree {
	
	Node root;
	
	public Node find(int iData){
		Node current=root;
		while(current!=null){
			if(current.iData==iData){
				break;
			}else if(iData<current.iData){
				current=current.leftChild;
			}else{
				current=current.rightChild;
			}
		}
		return current;
	}
	
	public void insert(int iData){
		Node newNode=new Node();
		newNode.iData=iData;
		
		if(root==null){
			root=newNode;
		}else{
			Node current=root;
			Node parent=root;
			while(true){
				parent=current;
				if(iData<current.iData){
					current=current.leftChild;
					if(current==null){
						parent.leftChild=newNode;
						return;
					}
				}else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
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
			
			inOrder(node.leftChild);
			
			inOrder(node.rightChild);
		}
	}
	
	public void postOrder(Node node){
		if(node!=null){
			
			inOrder(node.leftChild);
			
			inOrder(node.rightChild);
			
			System.out.print(node.iData+" ");
		}
	}
	
	private void deleteNoneChild(Node parent,Node delNode,boolean isLeftChild){
		//判断是否有子节点
		if(delNode==root){
			root=null;
		}else if(isLeftChild){
			parent.leftChild=null;
		}else{
			parent.rightChild=null;
		}
	}
	
	public boolean findDeleteNode(int iData){
		if(root==null){
			return false;
		}
		
		Node parent=root;
		Node current=root;
		boolean isLeftChild=false;
		while(current.iData!=iData){
			parent=current;
			if(iData<current.iData){
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
		if(current==null){//没找到要删除的节点
			return false;
		}
		
		//删除节点无子节点时
		if(current.leftChild==null && current.rightChild==null){
			deleteNoneChild(parent,current,isLeftChild);
		}else if(current.leftChild==null){
			deleteOneNode(parent,current,current.rightChild,isLeftChild);
		}else if(current.rightChild==null){
			deleteOneNode(parent,current,current.leftChild,isLeftChild);
		}else{
			deleteTwoNode(parent,current,isLeftChild);
		}
		return true;
	}
	
	private void deleteOneNode(Node parent,Node delNode,Node childNode,boolean isLeftChild){
		if(delNode==root){
			root=childNode;
		}else if(isLeftChild){
			parent.leftChild=childNode;
		}else{
			parent.rightChild=childNode;
		}
	}
	
	private Node getSuccessorNode(Node delNode){
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		
		while(current!=null){
			successorParent = current;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor!=delNode.rightChild){
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=delNode.rightChild;
		}
		
		return successor;
	}
	
	private void deleteTwoNode(Node parent,Node delNode,boolean isLeftChild){
		Node successor=getSuccessorNode(delNode);
		if(delNode==root){
			root=successor;
		}else if(isLeftChild){
			parent.leftChild=successor;
		}else{
			parent.rightChild=successor;
		}
		successor.leftChild=delNode.leftChild;
	}
}
