package java_grammer.homework.hw4;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        //에러가 발생해도 시스템이 종료되지 않고 다시 입력을 받을 수 있도록 함
        //에러 실질적 처리는 여기;
        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println("아아"+e.getMessage());
            }
        }
    }
}