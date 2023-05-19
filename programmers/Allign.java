package programmers;
import java.util.*;
public class Allign {
    public static void main(String[] args) {
        int [][] dots={ {1,4},{9,2},{3,8},{11,6}};

        Stack<Integer> st= new Stack<>();
        Iterator<Integer> it=st.iterator();
        for(int i=0;i<dots.length-1;i++){
            for(int j=0;j<dots.length-1;j++){
                int num=Math.abs(dots[i][0]-dots[j][0]);
                if(j==i)
                    continue;
                st.push(num);
            }


        }
            while(it.hasNext()){

                System.out.println(st.pop());
        }
    }
}
