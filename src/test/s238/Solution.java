package test.s238;

public class Solution {
	
    public int[] productExceptSelf(int[] nums) {
    	int[] result=new int[nums.length];
        for(int i=0;i<result.length;i++){
        	result[i]=1;
        }
        
        for(int i=0;i<nums.length;i++){
        	int left=0;
        	int right=nums.length-1;
    		while(left<i){
    			int temp=nums[left++];
    			if(temp==0){
    				result[i]=0;
    				break;
    			}else{
    				result[i]*=temp;
    			}
    		}
    		while(i<right){
    			int temp=nums[right--];
    			if(temp==0){
    				result[i]=0;
    				break;
    			}else{
    				result[i]*=temp;
    			}
    		}
        }
        return result;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={9,0,-2};//0,-18,0
		int[] result=s.productExceptSelf(nums);
		for(int ss:result){
			System.out.print(" "+ss);
		}
	}

}
