package test.s912;

public class Solution {
	
	void swap(int i,int j,int[] array){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	void manualSort(int left,int right,int size,int[] array){
		if(size==1){
			return;
		}else if(size==2){
			if(array[left]>array[right]){
				swap(left,right,array);
			}
		}else{
			if(array[left]>array[right]){
				swap(left,right,array);
			}
			if(array[left]>array[right-1]){
				swap(left,right-1,array);
			}
			if(array[right-1]>array[right]){
				swap(right-1,right,array);
			}
		}
	}
	
	int getPivot(int left,int right,int[] array){
		int center=(left+right)/2;
		if(array[left]>array[right]){
			swap(left,right,array);
		}
		if(array[left]>array[center]){
			swap(left,center,array);
		}
		if(array[center]>array[right]){
			swap(center,right,array);
		}
		int pivot=array[center];
		swap(center,right-1,array);
		return pivot;
	}
	
	int getPartition(int left,int right,int pivot,int[] array){
		int leftPtr=left;
		int rightPtr=right-1;
		while(true){
			while(array[++leftPtr]<pivot);
			while(array[--rightPtr]>pivot);
			if(leftPtr>=rightPtr){
				break;
			}else{
				swap(leftPtr,rightPtr,array);
			}
		}
		swap(leftPtr,right-1,array);
		return leftPtr;
	}
	
	void reQuickSort(int left,int right,int[] array){
		int size=right-left+1;
		if(size<=3){
			manualSort(left,right,size,array);
		}else{
			int pivot=getPivot(left,right,array);
			int partition=getPartition(left,right,pivot,array);
			reQuickSort(left,partition-1,array);
			reQuickSort(partition+1,right,array);
		}
	}
	
	public int[] sortArray(int[] nums) {
		reQuickSort(0,nums.length-1,nums);
		return nums;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={5,1,1,2,0,0};
		int[] a=s.sortArray(nums);
		for(int aa:a){
			System.out.print(aa+" ");
		}
	}

}
