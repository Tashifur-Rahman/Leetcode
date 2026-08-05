class Solution {
    public String removeStars(String s) {
        String res="";
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*' && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        res=st.pop()+res;
        return res;
    }
}