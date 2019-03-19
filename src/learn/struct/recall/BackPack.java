package learn.struct.recall;

public class BackPack {
	public static int maxV=Integer.MIN_VALUE;
	
	int[] weight={2,2,4,6,3};
	int n=5;
	int w=9;
	
	private void backPack(int i,int cw){
		if(cw==w || i==n){
			if(cw>maxV){
				maxV=cw;
				return;
			}
		}
		backPack(i+1,cw);
		if(cw+weight[i]<=w){
			backPack(i+1, cw+weight[i]);
		}
	}

	public static void main(String[] args) {
		BackPack backPack=new BackPack();
		
		backPack.backPack(0,0);
		System.out.println("max is "+maxV);

	}

}
