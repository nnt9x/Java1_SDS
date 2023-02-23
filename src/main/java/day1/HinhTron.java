package day1;

import java.util.Scanner;

public class HinhTron {
    // Nhập vào bán kính hình tròn từ bàn phím.
    // In ra chu vi và diện tích theo định dạng sau
    // HinhTron[chuVi=..., dienTich=...]

    // Số Pi = 3.14
    // Bán kính: double

    public static void main(String[] args) {
        // Input: r
        // Output: cv, dt

        // Buơc 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("R = ");
        double r = in.nextDouble();
        in.close();
        // Bước 2: Tính cv, dt
        double cv = 2 * 3.14 * r;
        double dt = 3.14 * r * r;

        // Bước 3: In ra console
        System.out.printf("HinhTron[chuVi=%10.3f, dienTich=%-10.3f]",cv, dt);
        // Kết quả làm tròn đến chữ số thập phân thứ 3??

    }

}
