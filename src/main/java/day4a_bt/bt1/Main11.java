package day4a_bt.bt1;

public class Main11 {
    public static void main(String[] args) {
        Circle c = new Circle(1, "blue");

        Cylinder1 cy1 = new Cylinder1(c,10 );
        System.out.println(cy1.aroundArea());
        System.out.println(cy1.totalArea());
        System.out.println(cy1.getVolume());
    }
}
