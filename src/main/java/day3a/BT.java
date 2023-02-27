package day3a;

import java.util.Scanner;

public class BT {
    /*
        1. Viết chương trình nhập vào 1 mảng số thực
    (có thể gồm
    âm hoặc dương) là bán kính của hình tròn.
    a. Có bao nhiêu hình tròn hợp lệ?
    b. Tính tổng chu vi của các hình tròn.
    c. Tìm ra hình tròn có chu vi lớn nhất.

    Yêu câu: sử dụng hàm để tính chu vi
     */

    public static void printArray(double[] arr){
        System.out.print("Array: ");
        for (Double d: arr) {
            System.out.print(d+"\t");
        }
        System.out.println();
    }
    public static double tinhChuVi(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        // Bước 1: Nhập mảng số thực, n, chi tiết các giá trị
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = in.nextInt();
        // Nhap chi tiet cho mang
        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d]=",i);
            arr[i] = in.nextDouble();
        }
        // Nhap va in ra mang
        printArray(arr);

        // Duyet mang so thuc -> loc ra nhung gia tri duong
        int count = 0;
        double tongCv = 0, maxCv = 0;

        for (int i = 0; i < n; i++){
            if(arr[i] > 0){
                // Cac gia tri hop le
                count ++;
                double cv = tinhChuVi(arr[i]);
                if(cv > maxCv){
                    maxCv = cv;
                }
                tongCv = tongCv + cv;
            }
        }
        System.out.printf("Co tat ca %d hop le\n", count);
        System.out.println("Tong chu vi = "+ tongCv);
        System.out.println("Hinh tron co chu vi lon nhat = "+ maxCv);

    }
}
