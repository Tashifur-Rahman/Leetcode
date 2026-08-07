class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> st=new Stack<>();
      for(int a:asteroids){
        if(a>0)
        st.push(a);
        else{
            while(!st.isEmpty() && st.peek()>0){
                if(st.peek()==Math.abs(a)){ //if both are equal destroy both
                st.pop();
                a=0;
                }
                else if (st.peek()<Math.abs(a)){
                    st.pop();
                    
                }
                else if(st.peek()>Math.abs(a)){
                    a=0;// curr asteroid destroyed
                    break;
                }
            }
            if(a!=0)//after checking with all elements if a isnt destroyed push it
                st.push(a);
        }
      }
      int[] res=new int[st.size()];
      int i=0;
      for(int num:st){
        res[i]=num;
        i++;
      }  
      return res;
    }
}