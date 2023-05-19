package programmers;

import java.util.List;

public class CtrlZ {
    public static void main(String[] args) {
        String s="10 Z 20 Z 1";
        String str=s.replace("Z","-0");
        String[] arr= str.split(" ");
        int sum=0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equals("-0")) {
                arr[i]="0";
                arr[i-1] = "-" + arr[i-1];

            }
            System.out.println(arr[i]);
            sum+=Integer.parseInt(arr[i]);
        }
        System.out.println(sum);

    }
}
