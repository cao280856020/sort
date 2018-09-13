package sort;

public class MergeSort {
	
	private int elements;
	private int[] theArray;
	
	private int[] workSpace;
	
	public MergeSort(int max){
		this.elements=0;
		this.theArray=new int[max];
	}
	
	public void insert(int value){
		this.theArray[elements++]=value;
	}
	
	private void merge(int lowPtr,int highPtr,int upperBound){
		int j=0;
		int lowerBound=lowPtr;
		int mid=highPtr-1;
		int n=(upperBound-lowerBound)+1;
		
		while(lowPtr<=mid && highPtr<=upperBound){
			if(theArray[lowPtr]<theArray[highPtr]){
				workSpace[j++]=theArray[lowPtr++];
			}else{
				workSpace[j++]=theArray[highPtr++];
			}
		}
		while(lowPtr<=mid){
			workSpace[j++]=theArray[lowPtr++];
		}
		while(highPtr<=upperBound){
			workSpace[j++]=theArray[highPtr++];
		}
		for(int i=0;i<n;i++){
			theArray[lowerBound+i]=workSpace[i];
		}
	}
	
	private void reMergeSort(int lowerBound,int upperBound){
		if(lowerBound==upperBound){
			return;
		}else{
			int mid=(lowerBound+upperBound)/2;
			reMergeSort(lowerBound,mid);
			reMergeSort(mid+1,upperBound);
			merge(lowerBound,mid+1,upperBound);
		}
	}
	
	public void mergeSort(){
		workSpace=new int[elements];
		this.reMergeSort(0, elements-1);
	}
	
	public static void main(String[] args) {
		
		MergeSort m=new MergeSort(10);
		m.insert(2);
		m.insert(3);
		m.insert(5);
		m.insert(1);
		m.insert(6);
		m.insert(8);
		m.mergeSort();
		
		for(int i=0;i<m.elements;i++){
			System.out.print(m.theArray[i]+" ");
		}
	}

}
