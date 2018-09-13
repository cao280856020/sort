package structures.heapSort;

public class Heap {

	private Node[] heapArray;
	
	private int maxSize;
	
	private int currentSize;
	
	public Heap(int max){
		this.maxSize=max;
		this.currentSize=0;
		this.heapArray=new Node[max];
	}

	public boolean isEmpty(){
		return currentSize==0;
	}
	
	private void trickleUp(int index){
		int parentIndex=(index-1)/2;
		Node bottom=heapArray[index];
		while(index>0 && heapArray[parentIndex].getKey()<bottom.getKey()){
			heapArray[index]=heapArray[parentIndex];
			index=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		heapArray[index]=bottom;
	}
	
	public boolean insert(int key){
		if(currentSize>=maxSize){
			return false;
		}
		
		Node newNode=new Node(key);
		heapArray[currentSize]=newNode;
		this.trickleUp(currentSize++);
		return true;
	}
	
	private void trickleDown(int index){
		Node top=heapArray[index];
		int largerIndex=0;
		while(index<currentSize/2){
			int leftChild=index*2+1;
			int rightChild=leftChild+1;
			if(heapArray[leftChild].getKey()<heapArray[rightChild].getKey()){
				largerIndex=rightChild;
			}else{
				largerIndex=leftChild;
			}
			if(top.getKey()>=heapArray[largerIndex].getKey()){
				break;
			}
			heapArray[index]=heapArray[largerIndex];
			index=largerIndex;
		}
		heapArray[index]=top;
	}
	
	public Node remove(){
		Node root=heapArray[0];
		heapArray[0]=heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	
	public boolean change(int index,int newValue){
		if(index<0 || index>=currentSize){
			return false;
		}
		int oldValue=heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue<newValue){
			this.trickleUp(index);
		}else{
			this.trickleDown(index);
		}
		return true;
	}
}
