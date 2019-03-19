package test.dongtaiguihua;

public class Solution {

	private static int s1(int n){
		if(n<=0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return s1(n-1)+s1(n-2);
		}
	}
	
	private static int s1(int n,int[] memory){
		if(n<=0){
			return 0;
		}else if(n==1){
			return 1;
		}else if(memory[n]==0){
			memory[n]=s1(n-1,memory)+s1(n-2,memory);
		}
		return memory[n];
	}
	
	private static int s2(int n){
		int[] f=new int[n+1];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<f.length;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[f.length-1];
	}
	
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
//		System.out.println(s1(50)+"   "+(System.currentTimeMillis()-start));
		
		int[] memory=new int[41];
		start=System.currentTimeMillis();
		System.out.println(s1(40,memory)+"   "+(System.currentTimeMillis()-start));
		
		start=System.currentTimeMillis();
		System.out.println(s2(40)+"   "+(System.currentTimeMillis()-start));
	}

}
