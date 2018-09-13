package structures.graphs;

public class QueueX {

	private final static int SIZE=20;
	private int[] queue;
	private int front;
	private int rear;
	
	public QueueX(){
		queue=new int[SIZE];
		front=0;
		rear=-1;
	}
	
	public boolean isEmpty(){
		return rear+1==front || front+SIZE==rear;
	}
	
	public void insert(int j){
		if(rear==SIZE-1){
			rear=-1;
		}
		queue[++rear]=j;
	}
	public int remove(){
		int temp=queue[front++];
		if(front==SIZE){
			front=0;
		}
		return temp;
	}
}
