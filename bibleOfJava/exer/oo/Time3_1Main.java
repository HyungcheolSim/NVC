package bibleOfJava.exer.oo;

class Time3_1 {
    int hour;
    int minute;
    int second;

}
class Time3_1Main{
    public static void main(String[] args){
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        //총 3명의 시간을 객체 배열로 관리
        Time3_1[] timeArr = new Time3_1[3];
        for(Time3_1 t:timeArr){
            t=new Time3_1();

        }
        for(int i=0;i< timeArr.length;i++)
            System.out.println("timeArr = " + timeArr[i]);
    }
}
