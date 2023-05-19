package programmers;

public class Leng {
    public static void main(String[] args) {
        String[] strlist= {"We","are","the","World!"};
        int[] answer= new int[strlist.length];
        int i=0;
        for(String str:strlist){
            str.replace("\"\"","");
            answer[i]=str.length();
            System.out.println("answer[i] = " + answer[i]);
            i++;
        }


    }
}
