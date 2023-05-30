package addeveryoperation;

public class Sonata extends Sedan{
    public Sonata(String color,double price){
        super("Hyundai", "Sonata", color, price);
    }
    @Override
    public void horn() {
    System.out.println("Sonata 경적 뿌우~~~뿌");
    }
}
