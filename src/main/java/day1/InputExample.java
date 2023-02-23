package day1;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Nhập dữ liệu từ bàn phím
        Scanner in = new Scanner(System.in);

        // Nhập họ tên:
        System.out.print("Nhập họ tên: ");
        String name = in.nextLine();
        // Nhập năm sinh:
        System.out.print("Nhập năm sinh: ");
        int dob = in.nextInt();

        // Tinh tuổi
        int age = 2023 - dob;

        /*
        Nhập họ tên và năm sinh từ bàn phím
        -> In ra họ tên và tuổi trên 1 dòng theo format sau:
        "Tôi tên là ..., năm nay tôi ... tuổi"
         */



    }
}
