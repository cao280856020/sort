package sort;

public class MergeSort {
	
	private int[] array;
	
	private int element;
	
	public MergeSort(int max){
		this.array=new int[max];
		this.element=0;
	}
	private void insert(int key){
		this.array[this.element++]=key;
	}
	
	private void merge(int[] workSpace,int lower,int high,int upperBound){
		int j=0;
		int lowerBound=lower;
		int mid=high-1;
		int n=upperBound-lowerBound;
		while(lower<=mid && high<=upperBound){
			if(array[lower]<array[high]){
				workSpace[j++]=array[lower++];
			}else{
				workSpace[j++]=array[high++];
			}
		}
		while(lower<=mid){
			workSpace[j++]=array[lower++];
		}
		while(high<=upperBound){
			workSpace[j++]=array[high++];
		}
		for(int i=0;i<=n;i++){
			array[lowerBound+i]=workSpace[i];
		}
	}
	
	private void reMergeSort(int[] workSpace,int lowerBound,int upperBound){
		if(lowerBound==upperBound){
			return;
		}else{
			int mid=(lowerBound+upperBound)/2;
			reMergeSort(workSpace,lowerBound,mid);
			reMergeSort(workSpace,mid+1,upperBound);
			merge(workSpace,lowerBound,mid+1,upperBound);
		}
	}
	
	private void sort(){
		int[] workSpace=new int[this.element];
		reMergeSort(workSpace,0,this.element-1);
	}
	public static void main(String[] args){
		MergeSort sort=new MergeSort(10);
		sort.insert(2);
		sort.insert(4);
		sort.insert(1);
		sort.insert(3);
		sort.insert(6);
		sort.insert(5);
		sort.sort();
		for(int i=0;i<sort.element;i++){
			System.out.print(sort.array[i]+" ");
		}
	}
}
