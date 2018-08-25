package sort;

public class Partition {

	static int[] array={9,8,7,6,5,4,3,2,1,0};
	
	public static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	public static void swap(int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	static int partitionSort(int min,int max,int pivot){
		int leftPar=min-1;
		int rightPar=max+1;
		int x=0,y=0;
		while(true){
			while(array[++leftPar]<pivot){
				System.out.println("x="+x++);
			}
			
			while(array[--rightPar]>pivot){
				System.out.println("y="+y++);
			}
			
			if(leftPar>=rightPar){
				break;
			}else{
				swap(leftPar,rightPar);
			}
		}
		return leftPar;
	}
	
	public static void main(String[] args) {
		int pivot=5;
		int partition=partitionSort(0,array.length-1,pivot);
		
		System.out.println("partition "+partition);
		
		printList();
	}

}
