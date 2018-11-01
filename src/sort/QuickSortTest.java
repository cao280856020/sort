package sort;

public class QuickSortTest {
	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void printList(){
		for(int a:array){
			System.out.print(" "+a);
		}
	}
	
	static void swap(int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void manualSort(int left,int right,int size){
		if(size==1){
			return;
		}else if(size==2){
			if(array[left]>array[right]){
				swap(left,right);
			}
		}else{
			if(array[left]>array[right]){
				swap(left,right);
			}
			if(array[left]>array[right-1]){
				swap(left,right-1);
			}
			if(array[right-1]>array[right]){
				swap(right-1,right);
			}
		}
	}
	
	static int getPivot(int left,int right){
		int center=(left+right)/2;
		if(array[left]>array[right]){
			swap(left,right);
		}
		if(array[left]>array[center]){
			swap(left,center);
		}
		if(array[center]>array[right]){
			swap(center,right);
		}
		int pivot=array[center];
		swap(center,right-1);
		return pivot;
	}
	
	static int getPartition(int left,int right,int pivot){
		int leftPtr=left;
		int rightPtr=right-1;
		while(true){
			while(array[++leftPtr]<pivot);
			while(array[--rightPtr]>pivot);
			if(leftPtr>=rightPtr){
				break;
			}else{
				swap(leftPtr,rightPtr);
			}
		}
		swap(leftPtr,right-1);
		return leftPtr;
	}
	
	static void reQuickSort(int left,int right){
		int size=right-left+1;
		if(size<=3){
			manualSort(left,right,size);
		}else{
			int pivot=getPivot(left,right);
			int partition=getPartition(left,right,pivot);
			reQuickSort(left,partition-1);
			reQuickSort(partition+1,right);
		}
	}
	
	static void quickSort(int left,int right){
		reQuickSort(left,right);
	}
	
	public static void main(String[] args) {
		quickSort(0,array.length-1);

		printList();
	}

}
