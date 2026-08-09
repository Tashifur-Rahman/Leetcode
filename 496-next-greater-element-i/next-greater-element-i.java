class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()){
                map.put(st.peek(),num);
                st.pop();
            }
            st.push(num);
        }
        for(int i:st){
            map.put(i,-1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}