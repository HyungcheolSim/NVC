package addeveryoperation;

import java_grammer.week03.hasExample.Door;
import java_grammer.week03.hasExample.Handle;
import java_grammer.week03.hasExample.Tire;

public abstract class Car {
    //field
    protected String company; //자동차 회사
    protected String model; // 자동차 모델
    protected String color; // 자동차 색상
    protected double price; // 자동차 가격

    protected double speed;  // 자동차 속도 , km/h
    protected char gear = 'P'; // 기어의 상태, P,R,N,D
    public boolean lights; // 자동차 조명의 상태

    public Tire[] tire;
    public Door[] door;
    public Handle handle;

    //constructor
    public Car(String company,String model,String color,double price){
        this.company=company;
        this.model=model;
        this.color=color;
        this.price=price;
    }

    //getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public char getGear() {
        return gear;
    }

    public void setGear(char gear) {
        this.gear = gear;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public Tire[] getTire() {
        return tire;
    }

    public void setTire(Tire[] tire) {
        this.tire = tire;
    }

    public Door[] getDoor() {
        return door;
    }

    public void setDoor(Door[] door) {
        this.door = door;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    //method
    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }
    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLights() {
        lights = !lights;
        return lights;
    }
    public void horn() {
        System.out.println("Defualt 빵빵");
    }
}
