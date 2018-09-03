package structures.heap;

public class Heap {

	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int mx){
		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}
	public boolean isEmpty(){
		return currentSize == 0;
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
		if(currentSize==maxSize){
			return false;
		}
		Node newNode=new Node(key);
		heapArray[currentSize]=newNode;
		trickleUp(currentSize++);
		return true;
	}
	public Node remove(){
		Node root=heapArray[0];
		heapArray[0]=heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	private void trickleDown(int index){
		Node top=heapArray[index];
		int largerChild;
		while(index < currentSize/2){
			int leftChild = 2*index+1;
			int rightChild = leftChild+1;
			if(heapArray[leftChild].getKey()<heapArray[rightChild].getKey()){
				largerChild=rightChild;
			}else{
				largerChild=leftChild;
			}
			if(top.getKey()>=heapArray[largerChild].getKey()){
				break;
			}
			heapArray[index]=heapArray[largerChild];
			index=largerChild;
		}
		heapArray[index]=top;
	}
	public boolean change(int index,int newValue){
		if(index<0 || index>=currentSize){
			return false;
		}
		int oldValue=heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		
		if(oldValue<newValue){
			trickleUp(index);
		}else{
			trickleDown(index);
		}
		
		return true;
	}
}
