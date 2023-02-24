package day2a;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        // Nhap n, kiem tra n am hay duong
        // Su dung switch case
        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        long n  = in.nextLong();
        in.close();

        switch ( (int) n){
            case 0:
                System.out.println("khong am khong duong");
                break;
            default:
                if(n > 0){
                    System.out.println(n+" la so duong");
                }
                else{
                    System.out.println(n+" la so am");
                }
                break;
        }
    }
}
