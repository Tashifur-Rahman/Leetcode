class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++)
        {
            res.add(i^(i>>1));
        }
        return res;
    }
}