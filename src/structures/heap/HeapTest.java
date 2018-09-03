package structures.heap;

public class HeapTest {

	public static void main(String[] args) {
		Heap heap=new Heap(5);
		heap.insert(3);
		heap.insert(27);
		heap.insert(85);
		heap.insert(93);
		heap.insert(57);

		heap.change(4, 56);
		
		while(!heap.isEmpty()){
			System.out.println("delete key is:"+heap.remove().getKey());
		}
	}

}
