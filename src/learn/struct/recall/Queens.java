package learn.struct.recall;

public class Queens {
	int result[] = new int[8];
	
	public void printQueens(){
		for(int row=0;row<8;++row){
			for(int column=0;column<8;++column){
				if(result[row]==column){
					System.out.print("Q ");
				}else{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	private boolean isOk(int row,int column){
		int leftUp=column-1;
		int rightUp=column+1;
		for(int i=row-1;i>=0;--i){
			if(result[i]==column)return false;
			if(leftUp>=0){
				if(result[i]==leftUp)return false;
			}
			if(rightUp<8){
				if(result[i]==rightUp)return false;
			}
			--leftUp;++rightUp;
		}
		return true;
	}
	
	public void calQueens(int row){
		if(row==8){
			printQueens();
			return;
		}
		for(int column=0;column<8;++column){
			if(isOk(row,column)){
				result[row]=column;
				calQueens(++row);
			}
		}
	}
	
	public static void main(String[] args) {
		Queens s=new Queens();
		s.calQueens(0);
	}

}
