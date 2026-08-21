class Solution {
    public int minFlips(int a, int b, int c) {
        int flips=0;
      for(int i=0;i<32;i++){
        if((c&1)==1){
            if((a&1)==0 && (b&1)==0)
            flips++;
        }
        if((c&1)==0){
            if((a&1)==1 && (b&1)==1)
            flips+=2;
            else if((a&1)==1 || (b&1)==1)
            flips++;
        }
        a=a>>1;
        b=b>>1;
        c=c>>1;
      }
      return flips;
    }
}