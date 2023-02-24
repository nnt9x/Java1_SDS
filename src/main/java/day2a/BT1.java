package day2a;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Buoc 1: Nhap n
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        // Buoc 2: Tinh toan
        long t = 0;
        for(int i = 1; i <= n; i++){
            t = t + i;
        }
        System.out.println(t);

    }
}
