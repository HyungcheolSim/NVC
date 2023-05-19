package programmers;

public class yuhansosu {
    public static void main(String[] args){
        int answer=0;
        int a=7,b=20;
        int num=b/(gcd(a,b));
        while (num != 1) {
            if(num%2==0){
                num/=2;
            }else if(num%5==0){
                num/=5;
            }else{
                answer=2;
            }
        }
        answer=1;

    }
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }else {
            return gcd(a,a%b);
        }
    }
}
