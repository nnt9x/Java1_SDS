package day4b.b2_9;

import day4b.b2_6.MyPoint;

public class Main {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(0, 3);
        MyPoint B = new MyPoint(4, 0);
        MyPoint C = new MyPoint(0, 0);

        MyTriangle myTriangle = new MyTriangle(A, B, C);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
    }
}
