class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if(s.equals("+")){
            int first=st.pop();
            int sec=st.pop();
            st.push(sec+first);
            }
            else if(s.equals("-")){
              int first=st.pop();
              int sec=st.pop();
              st.push(sec-first);  
            }
            
            else if(s.equals("*")){
                int first=st.pop();
                int sec=st.pop();
                st.push(first*sec);
            }
            else if(s.equals("/")){
               int first=st.pop();
                int sec=st.pop();
                if(first!=0)
                st.push(sec/first); 
            }
            else
            st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}