package java_grammer.week01;
import java.util.ArrayList;
public class Arr07 {
    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<Integer>();
        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());
    }
}
