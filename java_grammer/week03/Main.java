package java_grammer.week03;

public class Main {
    public static void main(String[] args) {
        //new 키워드를 통해 생성자를 호출한다.
        Car car = new Car();
        System.out.println("car.gear = " + car.gear);
        double speed=car.gasPedal(100,'D');
        System.out.println("speed = " + speed);

        boolean lights=car.onOffLight();
        System.out.println("lights = " + lights);
        System.out.println();

        System.out.println("car.gear = " + car.gear);
        System.out.println();
        car.carSpeeds(100,80);
        car.carSpeeds(110,120,150);

    }
}
