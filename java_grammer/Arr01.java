package java_grammer;

public class Arr01 {
    public static void main(String[] args) {
        String str="ABCD";
        int strLength=str.length();
        System.out.println(strLength);
        char strChar = str.charAt(1);
        System.out.println(strChar);
        String strSub=str.substring(0,3);
        System.out.println(strSub);
        String newStr="ABCD";
        boolean strEqual=newStr.equals(str);
        System.out.println(strEqual);
        char[] strCharArray = str.toCharArray();

        char[] charArray={'A','B','C'};
        String charArrayString=new String(charArray);
        System.out.println(charArrayString);




    }
}
