package structures.circularQueue;

public class CircularQueue {
	private int head;
	private int tail;
	private int n;
	private int[] array;
	
	public CircularQueue(int max){
		n=max;
		array=new int[max];
	}
	
	public boolean isEmpty(){
		return head==tail;
	}
	
	public boolean enqueue(int key){
		if((tail+1)%n==head){
			return false;
		}
		array[tail] = key;
		tail = (tail+1) % n;
		return true;
	}
	
	public int dequeue(){
		if(isEmpty()){
			return -1;
		}
		int data = array[head];
		head = (head+1) % n;
		return data;
	}
}
