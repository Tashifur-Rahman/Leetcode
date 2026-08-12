class Solution {
    public int singleNumber(int[] nums) {
    int sn=0;
    for(int num:nums){
        sn=sn ^num;
    }   
    return sn; 
    }
}