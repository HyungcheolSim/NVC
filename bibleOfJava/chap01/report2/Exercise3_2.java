package bibleOfJava.chap01.report2;

public class Exercise3_2 {
    public static void main(String args[]) {
        /*
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = (float)l; <<<<<<<<<<<<생략가능
        i = (int)ch;    <<<<<<<<<<<<생략가능
        */

        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // 연산자 우선순위 && -> ||  ->  <, >, >=
        //x=2 x<0 =false, x>2 = false  x<0 && x>2 = false/////  5>=5 || false = true || false = true;
        //결과값: true
        System.out.println(y += 10 - x++); //  y+= (10-x++) 괄호 속 먼저 진행 ++가 뒤에 있으므로 대입하고 난 후처리하여 10-2=8, y=y+8 y=5이므로 답은 13
        //13
        System.out.println(x += 2); //앞의 출력문에서 ++가 적용되어 x=3이 됨. x=x+2 x=3+2 => 5
        //5
        System.out.println(!('A' <= c && c <= 'Z'));    // !(true && true) -> ! true -> false
        //false
        System.out.println('C' - c); //'C' = 67 - 65 =2
        //2
        System.out.println('5' - '0'); // 53 -48 =5
        //5
        System.out.println(c + 1); //65 + 1 =66
        //66
        System.out.println(++c); // 65+1(아스키) =B
        //B
        System.out.println(c++); //앞에 문장에서 c=B 가 됨. 여기서의 ++는 당장 적용되지 않음
        //B
        System.out.println(c); // 앞의 문장 ++를 적용되어 c = B+1 =C
        //C
    }
}
