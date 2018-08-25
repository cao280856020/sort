package structures.tree;

public class Tree {
	
	private Node root;
	
	public Tree(){root = null;}
	
	public Node find(int key){
		Node currentNode=root;
		while(currentNode!=null){
			if(currentNode.iData==key){
				break;
			}else if(currentNode.iData>key){
				currentNode=currentNode.leftChild;
			}else{
				currentNode=currentNode.rightChild;
			}
		}
		return currentNode;
	}
	
	public void insert(int iD,double dD){
		Node newNode=new Node();
		newNode.iData=iD;
		newNode.dData=dD;
		
		if(root==null){
			root=newNode;
		}else{
			Node current=root;//閹跺﹥鐗撮惄顔肩秿閺�鎯у煂娑撳瓨妞傞懞鍌滃仯娑擄拷
			Node parent;	  
			while(true){
				parent=current;
				if(current.iData>=iD){
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
	//娑擃厼绨�   1 2 [3] 4 5
	public void inOrder(Node node){
		if(node!=null){
			inOrder(node.leftChild);
			
			System.out.print(" "+node.iData);
			
			inOrder(node.rightChild);
		}
	}
	//閸撳秴绨�  3 2 1 4 5
	public void preOrder(Node node){
		if(node!=null){
			System.out.print(" "+node.iData);
			
			preOrder(node.leftChild);
			
			preOrder(node.rightChild);
		}
	}
	//閸氬骸绨� 1 2 5 4 3
	public void postOrder(Node node){
		if(node!=null){
			postOrder(node.leftChild);
			
			postOrder(node.rightChild);
			
			System.out.print(" "+node.iData);
		}
	}
	
	public Node minium(){
		Node current=root;
		while(current!=null){
			if(current.leftChild==null){
				break;
			}else{
				current=current.leftChild;
			}
		}
		return current;
	}
	public Node maxium(){
		Node current=root;
		while(current!=null){
			if(current.rightChild==null){
				break;
			}else{
				current=current.rightChild;
			}
		}
		return current;
	}
	
	public boolean delete(int key){
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		//TODO 
//		if(root!=null){
//			
//		}
		while(current.iData!=key){
			parent=current;
			if(key<current.iData){
				isLeftChild=true;
				current=current.leftChild;
			}else{
				isLeftChild=false;
				current=current.rightChild;
			}
		}
		if(current==null){
			return false;
		}
		//閸掋倖鏌囬弰顖氭儊濞屸剝婀佺�涙劘濡悙锟�
		if(current.leftChild==null && current.rightChild==null){
			if(current==root){
				root=null;
			}else{
				if(isLeftChild){
					parent.leftChild=null;
				}else{
					parent.rightChild=null;
				}
			}
		}else if(current.leftChild==null){
			if(current==root){
				root=null;
			}else if(isLeftChild){
				parent.leftChild=current.rightChild;
			}else{
				parent.rightChild=current.rightChild;
			}
		}else if(current.rightChild==null){
			if(current==root){
				root=null;
			}else if(isLeftChild){
				parent.leftChild=current.rightChild;
			}else{
				parent.rightChild=current.rightChild;
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
	/*
	 * 找到后继节点
	 */
	public Node getSuccessor(Node delNode){
		Node successorParentNode=delNode;	//后继上级节点=要删除的节点
		Node successor=delNode;				//后继节点随便一个默认值=要删除的节点
		Node current=delNode.rightChild;	//后继选举节点=第一次就是右节点
		
		while(current!=null){
			successorParentNode=successor;	//后继上级节点=上一次被选中的后继节点
			successor=current;				//后继节点=第一次是右节点，之后都是左子节点
			current=current.leftChild;		
		}
		if(successor!=delNode.rightChild){	//后继不是右节点时
			successorParentNode.leftChild=successor.rightChild;	//后继上级节点=后继的左节点
			successor.rightChild=delNode.rightChild;	//后继右节点=删除节点的右节点
		}
		
		return successor;
	}
}
