package exer;

import java.util.Scanner;
public class Hello {
    public static void main(String args[]){
            Scanner scan= new Scanner(System.in);
            System.out.print("화씨 입력: ");
            int fahrenheit = scan.nextInt();
            float celcius = (float)(fahrenheit-32)*5/9*100;
            float delcel=(float)Math.floor((float)(fahrenheit-32)*5/9*100);
            float result;
            System.out.println("Celcius:"+celcius);
            System.out.println("Delcel:"+delcel);
            if(celcius-delcel>=0.5) {
                System.out.println("반올림 고고혓");
                result = (float) Math.ceil((double) celcius) / 100;
            }
            else {
                System.out.println("반올림 노노혓");
                result= (float) Math.floor((double) celcius) / 100;
            }
            System.out.println(result);
            //dot은 소수점을 버림한 수
            //화씨 변환 후에 나온 실수(float)-소수점 버린 수의 차가 0.5 이상이면 반올림하는게 맞다.
    }
}
