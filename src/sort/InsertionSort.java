package sort;

public class InsertionSort {

	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void sort(){
		for(int out=0;out<array.length;out++){
			int temp=array[out];
			int in=out;
			while(in>0 && array[in-1]>temp){
				array[in]=array[in-1];
				--in;
			}
			array[in]=temp;
		}
	}
	
	public static void main(String[] args) {
		sort();
		
		printList();

	}
	static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
}
