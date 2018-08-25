package sort;

public class QuickSort {

	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	
	static void quickSort(){
		reQuickSort(0,array.length-1,array.length-1);
	}
	
	static void reQuickSort(int left,int right,int pivot){
		if(left>right){
			return;
		}else{
			
		}
	}
	
	public static void main(String[] args) {
		quickSort();
		printList();
	}

}
