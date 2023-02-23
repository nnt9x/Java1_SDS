package day1b;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        // Input: số nguyên nhập từ bàn phím, dương
        // Output: nhuận hay ko nhuận
        long y;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        y = in.nextLong();

        if(y < 0){
            System.out.println("Số năm phải dương");
            System.exit(0);
        }

        if( (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0 ) ){
            System.out.println(y + " là năm nhuận!");
            System.exit(0);
        }

        System.out.println(y + " không phải năm nhuận!");

        // Test:
        // Năm nhuận: 2020, 2000, 1600, 1804, 2024

        // Ko nhuận: 1900, 1800, 1700, 2005, 2023

    }
}
