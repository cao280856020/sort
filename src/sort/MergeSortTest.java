package sort;

public class MergeSortTest {
	
	private int elements;
	private int[] array;
	
	public MergeSortTest(int max){
		this.elements=0;
		this.array=new int[max];
	}
	
	private void insert(int var){
		array[elements++]=var;
	}
	
	private void merge(int[] workSpace,int lowPtr,int highPtr,int upperBound){
		int j=0;
		int lowerBound=lowPtr;
		int mid=highPtr-1;
		int n=(upperBound-lowerBound)+1;
		
		while(lowPtr<=mid && highPtr<=upperBound){
			if(array[lowPtr]<array[highPtr]){
				workSpace[j++]=array[lowPtr++];
			}else{
				workSpace[j++]=array[highPtr++];
			}
		}
		while(lowPtr<=mid){
			workSpace[j++]=array[lowPtr++];
		}
		while(highPtr<=upperBound){
			workSpace[j++]=array[highPtr++];
		}
		for(int i=0;i<n;i++){
			array[lowerBound+i]=workSpace[i];
			workSpace[i]=0;
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
	
	public void mergeSort(){
		int[] workSpace=new int[elements];
		reMergeSort(workSpace,0,elements-1);
	}

	public static void main(String[] args) {
		MergeSortTest sort=new MergeSortTest(10);
		sort.insert(2);
		sort.insert(4);
		sort.insert(1);
		sort.insert(3);
		sort.insert(6);
		sort.insert(5);
		
		sort.mergeSort();
		
		for(int a=0;a<sort.elements;a++){
			System.out.print(sort.array[a]+" ");
		}
	}

}
