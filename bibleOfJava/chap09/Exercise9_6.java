package bibleOfJava.chap09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9_6 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };
        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();
            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }
            //1. 문자열 잡문자 제거
            //2. 일부가 포함되어있는지
            //3. list에 추가해서 포함된 문자열전화번호)들 출력
            //for(int i=0;i<phoneNumArr.length;i++){
            for (String str : phoneNumArr) {
                String phone = str.replace("-", "");
                if (phone.contains(input)) {
                    list.add(str);
                }
            }
            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}
