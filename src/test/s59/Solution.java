package test.s59;

public class Solution {
	
	
	private void ii(int[][] result,int row,int column,int value,int n,int level){
		if(value>n*n){
			return;
		}
		int left=-1+level;
		int right=result.length-level;
		int top=left+1;
		int foot=right;
		while(column<right){
			//判断是否没有值了，那就向右执行
			result[row][column]=value++;
			column+=1;
		}
		column-=1;
		row+=1;
		while(row<foot){
			//判断是否没有值了，那就向右执行
			result[row][column]=value++;
			row+=1;
		}
		row-=1;
		column-=1;
		while(column>left){
			//判断是否没有值了，那就向右执行
			result[row][column]=value++;
			column-=1;
		}
		column+=1;
		row-=1;
		while(row>top){
			//判断是否没有值了，那就向右执行
			result[row][column]=value++;
			row-=1;
		}
		this.ii(result, row+1, column+1, value, n, level+1);
	}
	
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        
        this.ii(result, 0, 0, 1, n, 0);
        
        return result;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		
		int[][] result=s.generateMatrix(5);
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result.length;j++){
				System.out.print(" "+result[i][j]);
			}
			System.out.println();
		}
	}

}
