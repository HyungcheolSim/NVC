package java_grammer.week04.generic;

public class ClassName<E extends Number> {
    private E element;
    void set(E element){
        this.element=element;
    }
    E get(){
        return element;
    }
/*    static E genericMethod(E o){
        return 0;
    }*/
//제네릭이 사용되는 메소드를 정적 메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독집적인 제네릭을 선언하면 가능하다.
    //또한 이렇게 선언된 제네릭 메소드는 제네릭 클래스 타입과 별도로 지정된다.
    static <T> T genericMethod1(T o){
        return o;
    }
    static <E> E genericMethod2(E o){
        return o;
    }
}
