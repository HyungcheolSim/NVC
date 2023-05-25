package java_grammer.week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass =new OurClass();
        try{
            //일단 실행
            ourClass.thisMethodIsDangerous();
        }catch(OurBadException e){
            System.out.println(e.getMessage());
        }finally {
            //에러가 발생하던 하지 않던 반드시 수행되는 로직
            System.out.println("우리는 방금 예외를 Handling 했습니다.");
        }

    }
}
