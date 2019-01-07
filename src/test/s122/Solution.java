package test.s122;

public class Solution {
	
	public int maxProfit(int[] prices) {
		int result=0;
		
		int temp=-1;
		
		for(int i=0;i<prices.length;i++){
			if(i<prices.length-1){
					if(prices[i]>prices[i+1]){
						//如果前数比后数大就跳过
						continue;
					}else{
						//否则查看有无上一直
						if(temp==-1){//如果没有就买入
							temp=prices[i];
						}else{
							//如果有值就卖出
							result+=prices[i]-temp;
							temp=-1;
						}
					}
			}else{
				//最后一个索引
				result+=prices[i]-temp;
			}
		}
		
		return result;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] prices={7,1,5,3,6,4};
//		int[] prices={1,2,3,4,5};
//		int[] prices={7,6,4,3,1};
		System.out.println(s.maxProfit(prices));
	}

}
