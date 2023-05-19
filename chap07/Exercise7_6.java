package chap07;

class Outer{
    static class Inner{
        int iv=100;
    }
    class Inner2{
        int iv=150;
    }
}

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer.Inner i= new Outer.Inner();
        Outer o=new Outer();
        Outer.Inner2 i2=o.new Inner2();


        System.out.println(i.iv);
        System.out.println(i2.iv);
    }

}
