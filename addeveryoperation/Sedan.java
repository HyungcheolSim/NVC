package addeveryoperation;

public abstract class Sedan extends Car{

    public Sedan(String company, String model, String color, double price) {
        super(company, model, color, price);
    }

    @Override
    public void horn() {
        System.out.println("Sedan 경적 뿌우~~~");
    }
}
