package java_grammer.week05.thread.deamon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i+"번째 demon");
            }
        };

        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨
        //사용자 쓰레드= 일반 쓰레드 (높은 우선순위를 가짐)

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+"번째 task");
        }
        //deamon thread가 끝나지 않았어도 main thread가 종료되면 프로그램이 종료된다.
        //daemon은 상대적으로 리소스를 적게 할당받는다.
    }
}