package java_grammer.week02;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //add peek poll
        //queue=FIFO
        //Queue: 생성자가 없는 인터페이스
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(5);
        q.add(9);

        System.out.println(q.peek());
    }
}
