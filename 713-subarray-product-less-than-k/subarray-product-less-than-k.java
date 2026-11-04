class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,count=0;
        int p=1;
        if(k<=1) return 0;
        for(int right=0;right<nums.length;right++){
            p*=nums[right];
            while(p>=k ){
                p/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}