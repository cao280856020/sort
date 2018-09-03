package sort;

public class ShellSortTest {
	static int[] array={5,6,2,1,8,9,0,7,3,4};
	
	static void print(){
		for(int a:array){
			System.out.print(a+" ");
		}
	}
	
	static void sort(){
		int h=1;
		while(h<=array.length){
			h=h*3+1;
		}
		while(h>0){
			for(int out=h;out<array.length;out++){
				int in=out;
				int temp=array[out];
				while(in>h-1 && array[in-h]>temp){
					array[in]=array[in-h];
					in-=h;
				}
				array[in]=temp;
			}
			h=(h-1)/3;
		}
	}
	
	public static void main(String[] args) {

		sort();
		print();
	}

}
