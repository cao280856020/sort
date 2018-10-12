package structures.circularQueue;

public class CircularQueue {
	private int head;
	private int tail;
	private int n;
	private int[] items;
	
	public CircularQueue(int n){
		this.n=n;
		this.items=new int[n];
	}
	
	public int dequeue(){
		if(head==tail){
			return -1;
		}else{
			int t=items[head];
			head=(head+1)%n;
			return t;
		}
	}
	
	public boolean enqueue(int key){
		if((tail+1)%n==head){
			return false;
		}else{
			items[tail]=key;
			tail=(tail+1)%n;
			return true;
		}
	}
	
	public boolean isEmpty(){
		return head==tail;
	}
}
