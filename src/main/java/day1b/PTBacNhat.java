package day1b;

import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        // ax + b = 0
        // Input: a, b
        // Out: x?
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a, b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        if( a == 0 && b == 0){
            System.out.println("Vô số nghiệm!");
        }
        if(a == 0 && b != 0){
            System.out.println("Vô nghiệm");
        }
        if(a != 0){
            double x = -b / a;
            System.out.printf("Có 1 nghiệm: x = %.2f", x);
        }

    }
}
