package test.hamming;

public class Solution {
	
	private String newB(String binary){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<4-binary.length();i++){
			sb.append("0");
		}
		sb.append(binary);
		return sb.toString();
	}
	
	public int hammingDistance(int x, int y) {
		String newBx=newB(Integer.toBinaryString(x));
		String newBy=newB(Integer.toBinaryString(y));
		
		int xLength=newBx.length();
		int yLength=newBy.length();
		if(xLength>yLength){
			for(int i=0;i<xLength-yLength;i++){
				newBy="0"+newBy;
			}
		}else if(xLength<yLength){
			for(int i=0;i<yLength-xLength;i++){
				newBx="0"+newBx;
			}
		}
		System.out.println("newBx="+newBx+" newBy="+newBy);
		
		int distance=0;
		for(int i=0;i<newBx.length();i++){
			if(newBx.charAt(i)!=newBy.charAt(i)){
				++distance;
			}
		}
		
		System.out.println(distance);
		return distance;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		
		s.hammingDistance(680142203, 1111953568);
	}

}
