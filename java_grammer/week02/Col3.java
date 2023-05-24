package java_grammer.week02;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        //최근 저장된 데이터를 나열하고 싶거나 데이터의 중복 처리를 막고 싶을 때
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
