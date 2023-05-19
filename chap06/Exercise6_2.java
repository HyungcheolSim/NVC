package chap06;

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    Student(){}
    String info(){
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+(kor+eng+math)+","+(int)((kor+eng+math)/3f*10+0.5)/10f;
    }

    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return (int)(getTotal()/3f*10+0.5)/10f;
    }
}

public class Exercise6_2 {
    public static void main(String[] args) {
        Student t = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = t.info();
        System.out.println(str);
        Student s= new Student();
        s.name="홍길동";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("이름: "+s.name);
        System.out.println("총점: "+s.getTotal());
        System.out.println("평균: "+s.getAverage());
    }
}
