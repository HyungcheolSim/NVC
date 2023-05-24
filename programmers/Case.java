package programmers;

public class Case {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        StringBuilder answer=new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97) {//소문자 일 경우
                //answer.append((char)(my_string.charAt(i)-32));
                answer.append((String.valueOf(my_string.charAt(i))).toLowerCase());
            } else if (my_string.charAt(i) <= 90) { //대문자일 경우
                //answer.append((char)(my_string.charAt(i)+32));
                answer.append((String.valueOf(my_string.charAt(i))).toUpperCase());
            }
        }
        System.out.println(answer);
    }
}
