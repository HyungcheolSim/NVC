package bibleOfJava.chap09;

public class Exercise9_3 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;
        for (int i = 0; i < src.length(); i++) {
            pos=src.indexOf(target, pos);
            if ( pos== -1) {
                break;
            } else {
                count++;
                pos += target.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));

    }
}
