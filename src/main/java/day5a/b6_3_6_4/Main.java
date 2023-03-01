package day5a.b6_3_6_4;

public class Main {
    public static void main(String[] args) {
        Movable point = new MovablePoint(1, 1, 2, 3);

        System.out.println(point);

        // Di chuyen len tren
        point.moveUp();
        System.out.println(point);
        // Di chuyen sang phai
        point.moveRight();
        System.out.println(point);
        // Di chuyen xuong duoi
        point.moveDown();
        System.out.println(point);
        // DI chuyen sang trai
        point.moveLeft();
        System.out.println(point);

        // Hinh tron
        Movable movableCircle = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(movableCircle);
        // Di chuyen

        movableCircle.moveUp();
        System.out.println(movableCircle);


    }
}
