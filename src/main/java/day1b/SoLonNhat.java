package day1b;

import java.util.Random;
import java.util.Scanner;

public class SoLonNhat {
    public static void main(String[] args) {
        // Buoc 1: Nhap du lieu
        long a, b, c, d, e;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a, b, c, d, e: ");
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();
        d = in.nextLong();
        e = in.nextLong();
        in.close();

        // Buoc 2: so sanh
        // Ys tưởng: coi 1 số là max, so sánh số max đó vs các số còn lại
        // Số còn lại > max -> max = số đó
        // Tiếp tuc cho đến hết
        long max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        if (max < e) {
            max = e;
        }
        System.out.println("Số lớn nhất là " + max);

    }
}
