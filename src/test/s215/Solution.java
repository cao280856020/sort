package test.s215;

public class Solution {
	
	private void swap(int i,int j,int[] nums){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	private void manualSort(int left,int right,int[] nums,int size){
		if(size==1){
			return;
		}else if(size==2){
			if(nums[left]>nums[right]){
				swap(left,right,nums);
			}
		}else{
			if(nums[left]>nums[right]){
				swap(left,right,nums);
			}
			if(nums[left]>nums[right-1]){
				swap(left,right-1,nums);
			}
			if(nums[right-1]>nums[right]){
				swap(right-1,right,nums);
			}
		}
	}
	
	private int getPivot(int left,int right,int[] nums){
		int center=(left+right)/2;
		if(nums[left]>nums[right]){
			swap(left,right,nums);
		}
		if(nums[left]>nums[center]){
			swap(left,center,nums);
		}
		if(nums[center]>nums[right]){
			swap(center,right,nums);
		}
		int pivot=nums[center];
		swap(center,right-1,nums);
		return pivot;
	}
	
	private int getPartition(int left,int right,int[] nums,int pivot){
		int leftPtr=left;
		int rightPtr=right-1;
		while(true){
			while(nums[++leftPtr]<pivot);
			while(nums[--rightPtr]>pivot);
			if(leftPtr>=rightPtr){
				break;
			}
			swap(leftPtr,rightPtr,nums);
		}
		int partition=leftPtr;
		swap(leftPtr,right-1,nums);
		return partition;
	}
	
	private void quickSort(int left,int right,int[] nums){
		int size=right-left+1;
		if(size<=3){
			manualSort(left,right,nums,size);
		}else{
			int pivot=getPivot(left,right,nums);
			int partition=getPartition(left,right,nums,pivot);
			quickSort(left,partition-1,nums);
			quickSort(partition+1,right,nums);
		}
	}
	
	private void sort(int[] nums){
		this.quickSort(0, nums.length-1, nums);
	}
	
	public int findKthLargest(int[] nums, int k) {
		this.sort(nums);
        return nums[nums.length-k];
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={3,2,3,1,2,4,5,5,6};
		System.out.println(s.findKthLargest(nums, 4));
	}

}
