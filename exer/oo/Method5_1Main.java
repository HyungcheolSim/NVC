package exer.oo;

class Method5_1{
    int add(int x, int y){
        int result = x+y;
        return result;
    }
}
public class Method5_1Main {
    public static void main(String[] args) {        //ctrl j 후 psvm
        Method5_1 method = new Method5_1();
        int result= method.add(3,5);
        System.out.println("result = " + result); //soutv 사용
    }
}
