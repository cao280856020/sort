package sort;

public class QuickSort {

	static long[] array={4,1,54,6,7,8,19,43,12,22,33,11,222,444,0,9,86,2,3,10};
	
	//交换索引值
	static void swap(int i,int j){
		long temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	static void print(){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
	//小于等于三时手动排序三个值
	static void manualSort(int left,int right,int size){
		if(size<=1){
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
	//获取枢纽值作为划分，并把该枢纽值交换到倒数第二个位置
	static long getPivot(int left,int right){
		int center=(right+left)/2;
		if(array[left]>array[center]){
			swap(left,center);
		}
		if(array[left]>array[right]){
			swap(left,right);
		}
		if(array[center]>array[right]){
			swap(center,right);
		}
		long pivot=array[center];
		swap(center,right-1);
		return pivot;
	}
	//获取划分索引位置
	static int getPartitionIndex(int left,int right,long pivot){
		int leftScan=left;
		int rightScan=right-1;
		while(true){
			while(array[++leftScan]<pivot);
			
			while(array[--rightScan]>pivot);
			
			if(leftScan>=rightScan){
				break;
			}else{
				swap(leftScan,rightScan);
			}
		}
		swap(leftScan,right-1);
		return leftScan;
	}
	static void quickSort(int left,int right){
		int size=right-left+1;			//1
		if(size<=3){
			manualSort(left,right,size);
		}else{
			long pivot=getPivot(left,right);		//2
			int partitionIndex=getPartitionIndex(left,right,pivot);	//3
			quickSort(left,partitionIndex-1);		//4
			quickSort(partitionIndex+1,right);		
		}
	}
	
	public static void main(String[] args) {
		quickSort(0,array.length-1);
		
		print();//打印输出排序好的值
	}

}
