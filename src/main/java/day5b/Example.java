package day5b;

import day2a.Ex;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        try {
            int a, b;
            Scanner in = new Scanner(System.in);
            System.out.print("Nhap a, b: ");
            a = in.nextInt();
            b = in.nextInt();
            in.close();
            double tmp = a / b;
            System.out.println("a/ b = " + tmp);
        }
        catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
