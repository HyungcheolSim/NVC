package chap01.report1;

public class Exercise2_8 {
    public static void main(String args[]) {


//2-4. 다음 중 변수를 잘못 초기화 한 것은?
        //  byte b = 256;   byte는 -127~ 128까지 표현 가능
        short b1 = 256;
        byte b2 = 127; //범위가 더 큰 short 타입을 사용하거나 리터럴 수를 범위 내 숫자로 변경

        // char c = '';  char은 빈 문자 초기화 불가, 공백 하나 띄우고 사용해야 함
        char c = ' ';
        //  char answer = 'no'; char은 한 문자만 입력받을 수 있다. no는 두 글자라서 초기화 오류
        char answer = 'n';
        String strAnswer = "no";
        //  float f = 3.14        뒤에 f를 붙여줘야 한다.(생략 불가)
        float f = 3.14f;
        // double d = 1.4e3f;    double 형은 리터럴 뒤에 d 또는 생략 가능
        double d = 1.4e3;


//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2"); //12
        System.out.println(true + ""); //true
        System.out.println('A' + 'B'); //131
        System.out.println('1' + 2); //51
        System.out.println('1' + '2'); //99
        System.out.println('J' + "ava"); //Java
        //System.out.println(true + null); //오류


//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        //예상 결과 : x=2, y=3, z=1
    }
}



