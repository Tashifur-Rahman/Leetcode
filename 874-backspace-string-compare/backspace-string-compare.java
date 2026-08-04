class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=helper(s);
        String t1=helper(t);
        return s1.equals(t1);
    }
    private String helper(String s){
        Stack<Character> st=new Stack<>();
        String res="";
        for(char c:s.toCharArray()){
            if(c=='#' && !st.isEmpty())
            st.pop();
            else if(c=='#' && st.isEmpty())
            continue;
            else
            st.push(c);
        }
        while(!st.isEmpty())
          res=st.pop()+res;
        return res;
    }
}