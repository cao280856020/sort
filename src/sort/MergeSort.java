package sort;

import java.util.Random;

public class MergeSort {
	
	private int[] array;
	
	private int element;
	
	public MergeSort(int max){
		array=new int[max];
		element=0;
	}
	
	public void insert(int data){
		array[element++]=data;
	}
	
	public boolean isEmpty(){
		return element==0;
	}
	
	public void merge(int[] workSpace,int lowerPtr,int highPtr,int upperBound){
		int j=0;
		int lowerBound=lowerPtr;
		int mid=highPtr-1;
		int n=(upperBound-lowerBound)+1;
		
		while(lowerPtr<=mid && highPtr<=upperBound){
			if(array[lowerPtr]<=array[highPtr]){
				workSpace[j++]=array[lowerPtr++];
			}else{
				workSpace[j++]=array[highPtr++];
			}
		}
		
		while(lowerPtr<=mid){
			workSpace[j++]=array[lowerPtr++];
		}
		while(highPtr<=upperBound){
			workSpace[j++]=array[highPtr++];
		}
		
		for(int i=0;i<n;i++){
			array[lowerBound+i]=workSpace[i];
		}
	}
	
	public void reMergeSort(int[] workSpace,int lowerBound,int upperBound){
		if(lowerBound==upperBound){
			return;
		}else{
			int mid=(lowerBound+upperBound)/2;
			reMergeSort(workSpace,lowerBound,mid);
			reMergeSort(workSpace,mid+1,upperBound);
			merge(workSpace,lowerBound,mid+1,upperBound);
		}
		
	}
	
	public void sort(){
		int[] workSpace=new int[element];
		reMergeSort(workSpace,0,element-1);
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
