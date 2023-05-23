package java_grammer.week1;

import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String title=sc.nextLine(); //제목
        int star= (int)sc.nextFloat(); //평점
        float per= star/5.0f*100; //퍼센트 계산
        //sc.nextLine(); //남아있는 엔터값 제거
        sc.skip("[\\r\\n]+");

        String[] recipe =new String[10];

        for(int i=0;i<recipe.length;i++){ //레시피 입력
            recipe[i]=(i+1)+". "+sc.nextLine();
        }
        System.out.println("[ "+title+" ]");
        System.out.println("별점 : "+star+" ("+per+"%)");

        for (String s : recipe) {
            System.out.println(s);
        }
    }
}
