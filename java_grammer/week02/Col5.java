package java_grammer.week02;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        //set(집합): 순서 없고 중복 가능
        //set, hashset treeset
        //생성자가 없는 껍데기라서 바로 생성할 수 없음
        //HashSet을 이용해서 구현
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(9);
        set.add(1);
        set.add(12);
        for(Integer value:set){
            System.out.println(value);

        }
        System.out.println(set.contains(1));
    }

}
