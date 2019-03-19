package test.s54;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	
	
	private void ii(int[][] result,int row,int column,int value,int m,int n,int level,List<Integer> list,Set<Integer> set){
		if(value>m*n){
			return;
		}
		int left=-1+level;
		int right=n-level;
		int top=left+1;
		int foot=m-level;
		while(column<right){
			//判断是否没有值了，那就向右执行
			value++;
			if(set.add(result[row][column])){
				list.add(result[row][column]);
			}
			column+=1;
		}
		column-=1;
		row+=1;
		while(row<foot){
			//判断是否没有值了，那就向右执行
			value++;
			if(set.add(result[row][column])){
				list.add(result[row][column]);
			}
			row+=1;
		}
		row-=1;
		column-=1;
		while(column>left){
			//判断是否没有值了，那就向右执行
			value++;
			if(set.add(result[row][column])){
				list.add(result[row][column]);
			}
			column-=1;
		}
		column+=1;
		row-=1;
		while(row>top){
			//判断是否没有值了，那就向右执行
			value++;
			if(set.add(result[row][column])){
				list.add(result[row][column]);
			}
			row-=1;
		}
		this.ii(result, row+1, column+1, value, m ,n, level+1, list,set);
	}
	
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if(matrix.length==0){
        	return list;
        }
        this.ii(matrix, 0, 0, 1, matrix.length, matrix[0].length, 0,list,new HashSet<Integer>());
        return list;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		
		int[][] result=new int[3][4];

		result[0][0]=1;
		result[0][1]=2;
		result[0][2]=3;
		result[0][3]=4;
		
		result[1][0]=5;
		result[1][1]=6;
		result[1][2]=7;
		result[1][3]=8;
		
		result[2][0]=9;
		result[2][1]=10;
		result[2][2]=11;
		result[2][3]=12;
		List<Integer> r=s.spiralOrder(result);
		for(Integer ss:r){
			System.out.print(" "+ss);
		}
	}

}
