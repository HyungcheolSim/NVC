package java_grammer;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();

        st.push(10);
        st.push(15);
        st.push(1);

       /* while(!st.isEmpty()){
            System.out.println(st.pop());
        }*/
        System.out.println(st.peek());
        System.out.println(st.size());
    }


}
