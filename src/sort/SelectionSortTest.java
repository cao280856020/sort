package sort;

public class SelectionSortTest {
	
	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	
	static void sort(){
		for(int out=0;out<array.length-1;out++){
			int min=out;
			for(int in=out+1;in<array.length;in++){
				if(array[min]>array[in]){
					min=in;
				}
			}
			int temp=array[out];
			array[out]=array[min];
			array[min]=temp;
		}
	}
	
	public static void main(String[] args) {
		sort();

		printList();
	}

}
