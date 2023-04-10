package exer;

public class Hello {
    public static void main(String args[]){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // 연산자 우선순위 && -> ||  ->  <, >, >=
        //x=2 x<0 =false, x>2 = false  x<0 && x>2 = false/////  5>=5 || false = true || false = true;
        //결과값: true
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
