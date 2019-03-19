package test.jj;

import java.math.BigDecimal;

public class Test {

	private static BigDecimal j(BigDecimal q,int year){
		BigDecimal result=new BigDecimal(1);
		for(int i=0;i<year;i++){
			result=result.multiply(q);
		}
		return result;
	}
	
	public static void main(String[] args) {
		BigDecimal benjin=new BigDecimal(20);
		BigDecimal q=new BigDecimal(0.037);
		int year=20;
		
		BigDecimal j=j(q,year);
		System.out.println(j.toString());
		
		
		BigDecimal result=benjin.multiply(j(q,year)).multiply(new BigDecimal(1).subtract(j(q,year))).divide(new BigDecimal(1).subtract(q));
		System.out.println(result.toString());
	}

}
