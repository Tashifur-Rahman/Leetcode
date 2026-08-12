class Solution {
    public char findTheDifference(String s, String t) {
       int diff=sumofascii(s)-sumofascii(t);
       diff=Math.abs(diff);
       return (char)diff; 
    }
    private int sumofascii(String s){
        int soa=0;
        for(char ch:s.toCharArray()){
            soa=soa+(int)ch;
        }
        return soa;
    }
}