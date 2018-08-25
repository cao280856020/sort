package sort;

public class BubbleSort {
	
	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	public static void swap(int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void sort(){
		for(int out=array.length-1;out>0;out--){
			for(int in=0;in<out;in++){
				if(array[in]>array[in+1]){
					swap(in,in+1);
				}
			}
		}
	}
	
	static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) {
		
		sort();
		
		printList();
	}

}
