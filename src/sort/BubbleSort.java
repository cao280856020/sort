package sort;

public class BubbleSort {
	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void swap(int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	static void print(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	
	static void sort(){
		int lastExchangeIndex=0;
		int sortLength=array.length-1;
		for(int out=0;out<array.length;out++){
			boolean isSorted=true;
			for(int in=0;in<sortLength;in++){
				if(array[in]>array[in+1]){
					swap(in,in+1);
					isSorted=false;
					lastExchangeIndex=in;
				}
			}
			sortLength=lastExchangeIndex;
			if(isSorted){
				break;
			}
		}
	}
	
	public static void main(String[] args){
		
		sort();
		
		print();
	}
}
