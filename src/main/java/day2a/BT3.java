package day2a;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Buoc 1: Nhap n
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        // Kiem tra n
        if(n <= 0){
            System.out.println("Khong hop le");
            System.exit(0);
        }

        // Buoc 2: Tinh toan
        double t = 0;
        for(int i = 1; i <= n; i++){
            t = t + 1.0/i;
        }
        System.out.println(t);
    }
}
