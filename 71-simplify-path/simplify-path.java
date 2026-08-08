class Solution {
    public String simplifyPath(String path) {
        String[] components=path.split("/");
        Stack<String> st=new Stack<>();
        for(String a:components){
            if(a.equals(".")||a.equals("")) //curr dir, can be ignored
            continue;
            if(a.equals("..")){ //move to previous dir
            if(!st.isEmpty())
            st.pop();
            }
            else //any other name must be considered as dir name
            st.push(a); 
        }
        String sb="";
        while(!st.isEmpty()){
            sb=st.pop()+"/"+sb;
        }
        if(sb.endsWith("/")){
            sb=sb.substring(0,sb.length()-1);
        }
        if (sb.length()==0)
        return "/";
        else
        return "/"+sb;
    }
}