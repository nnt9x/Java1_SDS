package day4a_bt.bt1;

public class Cylinder1 {
    // Thuoc tinh
    private Circle circle;
    private double height = 1;
    // Phuong thuc

    public Cylinder1() {
    }

    public Cylinder1(Circle circle) {
        this.circle = circle;
    }

    public Cylinder1(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }
    public Cylinder1(double r, double height){
        this.circle = new Circle(r);
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return circle.getArea() * height;
    }

    public double aroundArea(){
        return  circle.getRadius() * 2 * Math.PI * height;
    }
    public double totalArea(){
        return aroundArea() + 2 * circle.getArea();
    }
}
