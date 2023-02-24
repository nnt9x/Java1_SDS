package day2b;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Buoc 1 nhap du lieu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b) {
            System.out.println("a phai be hon b");
            System.exit(0);
        }
        long t = 0;
        // Buoc 2: tinh toan
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                t += i;
            }
        }
        // Buoc 3: hien thi
        System.out.println("Tong so le = " + t);
    }
}
