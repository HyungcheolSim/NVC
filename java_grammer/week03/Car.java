package java_grammer.week03;

//클래스를 만드는 4STEP

//  1. 만드려고 하는 설계도를 선언(클래스 선언)
//  2. 객체가 가지고 있어야 할 속성(필드)을 정의한다.
//  3. 객체를 생성하는 방식을 정의한다.(생성자)
//  4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.
public class Car {
    //고유 데이터 영역
    String company;
    String model="Gv80";
    String color;
    double price;
    //상태 데이터 영역
    double speed;
    char gear;
    boolean lights=true;
    //객체 데이터 영역
    Tire tire=new Tire();
    Door door;
    Handle handle;

    //생성자: 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 ㅏㅄ이 필수로 들어와야 하는지 정의!
    public Car(){
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");
    }
    //기본생성자(생략가능)
    //<메서드 영역>
     double gasPedal(double kmh,char type){
        changeGear(type);//가속도 페달을 밟으면 자동으로 기어가 변경된다.
        speed=kmh;
        return speed;
    }
    double breakPedal(){
        speed=0;
        return speed;
    }

    char changeGear(char type){
        gear=type;
        return gear;
    }

    boolean onOffLight(){
        lights=!lights;
        return lights;
    }
    void horn(){
        System.out.println("빵빵");
    }
    
    //자동차의 속도를 구하는 메서드
    void carSpeeds(double ...speeds){
        for(double v:speeds){
            System.out.println("v = " + v);
        }
    }
}
