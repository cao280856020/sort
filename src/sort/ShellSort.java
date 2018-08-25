package sort;

public class ShellSort {

	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void printList(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	
	static void sort(){
		int h=1;
		while(h<=array.length){
			h=h*3+1;
		}
		int i=0;
		while(h>0){
			for(int out=h;out<array.length;out++){
				int temp=array[out];
				int in=out;
				while(in>h-1 && array[in-h]>temp){
					array[in]=array[in-h];
					in-=h;
				}
				array[in]=temp;
			}
			h=(h-1)/3;
		}
		System.out.println("i====="+i);
	}
	
	public static void main(String[] args) {
		sort();
		
		printList();
	}

}
