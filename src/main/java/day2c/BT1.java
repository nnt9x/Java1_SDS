package day2c;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BT1 {
    // Tao ra mot mang so thuc double ngau nhien gom co n phan tu
    // Sau do in ra phan tu co gia tri lon nhat
    public static void main(String[] args) {
        Random r = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        // Tao mang n phan tu
        double[] arr = new double[n];

        // Random cac gia tri cho mang
        for(int i = 0; i < n; i++){
            arr[i] = r.nextDouble();
        }
        // In thu ra mang vua tao
        // Foreach
        for (double a: arr) {
            System.out.println(a);
        }

    }
}
