package structures.circularQueue;

public class Test {

	public static void main(String[] args) {
		CircularQueue1 queue=new CircularQueue1(6);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		while(queue.isEmpty()!=true){
			System.out.println(queue.dequeue());
		}
	}

}
