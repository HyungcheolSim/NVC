package bibleOfJava.chap09;

public class Exercise9_4 {
    public static boolean contains(String src,String target){
        return src.contains(target);
    }
    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
