package day4a_bt.bt1;

public class Main1 {
    public static void main(String[] args) {
        // Tao doi tuong Circle
        Circle c1 = new Circle(3);
        System.out.println(c1);
        System.out.println("Area: "+ c1.getArea());

        // Tao doi tuong Hinh Tru
        Cylinder cy1 = new Cylinder();
        System.out.println("Volume: "+ cy1.getVolume());

        Cylinder cy2 = new Cylinder(5);
        System.out.println("Volume: "+ cy2.getVolume());

    }
}
