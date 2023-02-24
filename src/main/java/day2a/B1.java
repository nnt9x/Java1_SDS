package day2a;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        long n  = in.nextLong();
        in.close();

        // C1
        if(n > 0){
            System.out.println(n+" la so duong");
        } else if (n == 0) {
            System.out.println(n+" khong am khong duong");
        }
        else{
            System.out.println(n+" la so am");
        }

        // C2
        if(n > 0){
            System.out.println(n+" la so duong");
        }
        if (n == 0) {
            System.out.println(n+" khong am khong duong");
        }
        if(n < 0){
            System.out.println(n+" la so am");
        }

        // C3
        if(n > 0){
            System.out.println(n+" la so duong");
        }
        else{
            // n <= 0
            if(n == 0){
                System.out.println(n+" la so khong am khong duong");
            }
            else{
                System.out.println(n+" la so am");
            }
        }

    }
}
