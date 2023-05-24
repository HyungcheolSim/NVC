package bibleOfJava.exer.oo;

class Method5_2 {
    void gugudan(int dan) {
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + " 단 시작!");
        for (int i = 0; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }
    boolean checkMax(int x, int y){
        if(x>y){
            return true;
        }else{
            return false;
        }
    }
}

public class Method5_2Main {
    public static void main(String[] args) {
        Method5_2 method52 = new Method5_2();

        method52.gugudan(2);
        method52.gugudan(5);
        method52.gugudan(10);
        method52.gugudan(9);

        System.out.println("mehtod52.checkMax(10, 8) = "+ method52.checkMax(10,8));
        System.out.println("mehtod52.checkMax(5, 9) = "+ method52.checkMax(5,9));

    }
}
