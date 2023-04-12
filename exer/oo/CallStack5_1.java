package exer.oo;

class CallStack5_1 {

    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}