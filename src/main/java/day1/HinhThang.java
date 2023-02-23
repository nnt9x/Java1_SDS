package day1;

import java.util.Scanner;

public class HinhThang {
    /*
    Tính chu vi và diện tích hình thang cân?

    Input: đáy lớn b, đáy bé a, cạnh bên m
    Output: cv, dt
    Kết quả làm tròn đến chữ số thập phân thứ 4.
    In theo format sau:
    HinhThangCan[chuVi: ... cm, dienTich: ... cm^2 ]
     */
    // Test: a = 2, b = 3, m = 4



    public static void main(String[] args) {
        // Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập cạnh be, cạnh lon, cạnh bên: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double m = in.nextDouble();
        // Buơcs 2: Tính cv, dt
        double cv = a + b + 2*m;
        // Tinh chieu cao h
        double n = (b-a)/2;
        double h = Math.sqrt(m*m - n*n);

        double dt = (a+b)*h/2;

        // Bước 3: In ra thông tin
        System.out.printf("HinhThangCan[chuVi: %.4f cm, dienTich: %.4f cm^2 ]",cv, dt);

    }
}
