package java_grammer.week04.generic;

public class Main {
    public static void main(String[] args) {
        ClassName<Double> a= new ClassName<>();
        ClassName<Integer> b= new ClassName<>();

        a.set(10.0);
        b.set(10);

        System.out.println("a data = " + a.get());
        System.out.println("a E Type : "+a.get().getClass().getName());

        System.out.println();
        System.out.println("b data = " + b.get());
        System.out.println("b E Type : "+b.get().getClass().getName());
        //int char 등의 기본타입은 불가능하다.

        //제네릭 메소드
        System.out.println("<T> returnType : "+ClassName.genericMethod1(3).getClass().getName());
        System.out.println("<T> returnType : "+ClassName.genericMethod1("ABCD").getClass().getName());
        System.out.println("<T> returnType : "+ClassName.genericMethod2(a).getClass().getName());
        System.out.println("<T> returnType : "+ClassName.genericMethod2(3.0).getClass().getName());
    }
}
