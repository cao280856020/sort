package structures.circularQueue;

public class CircularQueue1 {
	private int n;
	private int head;
	private int tail;
	private int[] array;
	
	public CircularQueue1(int n){
		this.n=n;
		this.array=new int[n];
	}
	
	public boolean isEmpty(){
		return head==tail;
	}
	
	public boolean enqueue(int v){
		if((tail+1)%n==head){
			return false;
		}
		array[tail]=v;
		tail=(tail+1)%n;
		return true;
	}
	
	public int dequeue(){
		int temp=array[head];
		head=(head+1)%n;
		return temp;
	}
}
