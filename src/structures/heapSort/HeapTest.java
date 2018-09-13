package structures.heapSort;

public class HeapTest {

	public static void main(String[] args){
		Heap heap=new Heap(5);
		heap.insert(45);
		heap.insert(41);
		heap.insert(4);
		heap.insert(5);
		heap.insert(1);
		
		heap.change(1, 50);
		
		while(!heap.isEmpty()){
			System.out.print(heap.remove().getKey()+" ");
		}
		
	}
}
