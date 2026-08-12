class Solution {
    public int hammingDistance(int x, int y) {
     int z=x^y;int hamming_dist=0;
      for(int i=0;i<32;i++){
        if((z&1)==1)
        hamming_dist++;
        z=z>>1;
      }  
      return hamming_dist;
    }
}