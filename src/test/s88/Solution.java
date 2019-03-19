package test.s88;

public class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[nums1.length];
        int i=0;
        for(int j:nums1){
        	temp[i++]=j;
        }
        int first=0;
        int second=0;
        int index=0;
        while(first<m && second<n){
        	if(temp[first]<nums2[second]){
        		nums1[index++]=temp[first++];
        	}else{
        		nums1[index++]=nums2[second++];
        	}
        }
        while(first<m){
        	nums1[index++]=temp[first++];
        }
        while(second<n){
        	nums1[index++]=nums2[second++];
        }
    }
	
	//nums1 = [1,2,3,0,0,0], m = 3
	//nums2 = [2,5,6],       n = 3
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		int m=3;
		int n=3;
		s.merge(nums1,m,nums2,n);
		for(int j:nums1){
			System.out.print(" "+j);
		}
	}

}
