package day1b;

import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args) {
        // Bước 1: Nhập x
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        long x = in.nextLong();
        // Bước 2: Kiểm tra + hiển thị

        /* if(logic expression){
            // True statements
        }
         */
        if (x % 2 == 0) {
            System.out.printf(x + " là số chẵn!");
        }
        if(x % 2 != 0){
            System.out.println(x + " là số lẻ");
        }
    }
}
