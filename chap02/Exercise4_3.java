package chap02;

//4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        /*빈 칸*/
        for(int i=1;i<=10;i++){
            sum=0;
            for(int j=1;j<i;j++){
                sum+=j;
                System.out.println("sum = " + sum);
            }
            totalSum+=sum;
        }
    }
}
//      165