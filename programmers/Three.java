package programmers;

public class Three {
    public static void main(String[] args) {
        int order= 29423;
        String str=String.valueOf(order);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='3'||str.charAt(i)=='6'||str.charAt(i)=='9'){
                count++;
            }
        }
        System.out.println(count);
    }


}
