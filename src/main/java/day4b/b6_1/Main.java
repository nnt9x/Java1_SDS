package day4b.b6_1;

import day1a.HinhTron;
import day4a.bt.HinhChuNhat;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        // shape 1 = Hinh Tron
        shapes[0] = new Circle(3);
        // shape 2 = HCN
        shapes[1] = new Rectangle(4, 5);
        // shape 3 = HT
        shapes[2] = new Circle(4);

        // In ra chu vi, dien tich cac hinh
        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].toString());
            System.out.printf("Chu vi = %.2f, dien tich = %.2f \n"
            , shapes[i].getPerimeter(), shapes[i].getArea());
        }
    }
}
