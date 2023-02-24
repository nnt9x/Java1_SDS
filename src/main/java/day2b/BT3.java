package day2b;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Quy uoc: -1: dung chuong trinh
        int number, t;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("n = ");
            number = in.nextInt();
            if(number < 0){
                continue;
            }
            // Tinh tai day
            if(number == 0){
                System.out.println("0! = 1");
                continue;
            }
            t = 1;
            for(int i = 1; i <= number; i++){
                t = t * i;
            }
            System.out.printf("%d! = %d \n", number, t);
        }
        while (number != -1);
    }
}
