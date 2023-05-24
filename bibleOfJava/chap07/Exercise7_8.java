package bibleOfJava.chap07;

class Outer4 {
    int value=10;

    class Inner{
        int value =20;
        void method1(){
            int value=30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer4.this.value);
        }
    }
}
public class Exercise7_8 {
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        Outer4.Inner inner= outer4.new Inner();

        inner.method1();
    }
}
