package java_grammer.week02;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        //Map key, value pair
        //key 라는 값으로 unique 하게 보장 가능해야 함
        // map hashMap TreeMap 으로 으용ㅇ
        Map<String,Integer> map= new HashMap<>();
        map.put("일",11);
        map.put("이",12);
        map.put("삼",13);
        map.put("삼",14);
        map.put("삼",15);

        for(String key:map.keySet()){
            System.out.println(key);
        }
        for(Integer value:map.values()){
            System.out.println(value);
        }
        map.putIfAbsent("사",16);
        map.putIfAbsent("사",17);
        //마지막에 넣은 걸로 갱신됨.
        //존재하면 실행되지 않기 떄문에 앞에 넣은걸로 유지가능
    }
}
