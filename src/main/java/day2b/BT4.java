package day2b;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        // Buoc 1: Nhap a , b
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b: ");
        double a = in.nextDouble();
        int b = in.nextInt();
        in.close();
        // Buoc 2:
        double t;
        if(b == 0){
            t = 1;
        } else if (b > 0) {
            t = 1;
            for(int i  = 1; i <= b; i++){
                t = t * a;
            }
        }
        else{
            // b < 0
            t = 1;
            for(int i  = 1; i <= Math.abs(b); i++){
                t = t * a;
            }
            t = 1/t;
        }
        System.out.printf("%.2f^%d = %.2f",a, b, t );

    }
}
