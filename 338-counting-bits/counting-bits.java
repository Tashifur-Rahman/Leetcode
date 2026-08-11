class Solution {
    public int[] countBits(int n) {
       int[] res=new int[n+1];
       for(int i=0;i<=n;i++)
       res[i]=no_of_1_bits(i);
       return res;
    }
    private int no_of_1_bits(int n){
        int count=0;
        for(int i=0;i<32;i++){
            if((n>>i & 1)==1)
            count++;
        }
        return count;
    }
}