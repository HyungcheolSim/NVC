package programmers;

import java.util.*;

public class DuplicateWord {
    public static void main(String[] args) {
        String my_string="We are the world";
        StringBuilder answer= new StringBuilder();

        for(int i=0;i<my_string.length();i++){
            if(i==my_string.indexOf(my_string.charAt(i))){
                answer.append(my_string.charAt((i)));
            }
        }
        System.out.println(answer);
    }
}
