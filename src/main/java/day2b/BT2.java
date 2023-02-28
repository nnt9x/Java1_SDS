package day2b;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // Buoc 1: Nhap du lieu
        Scanner in = new Scanner(System.in);
        System.out.print("N = ");
        int n = in.nextInt();
        in.close();
        if( n < 0){
            System.out.println("n không hợp lê");
            System.exit(0);
        }
        // Buoc 2:Kiem tra
        boolean isNguyenTo = n != 1;
        //
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isNguyenTo = false;
                break;
            }
        }
        if(isNguyenTo){
            System.out.println(n + " la so nguyen to");
        }
        else {
            System.out.println(n + " khong la so nguyen to");
        }

        // Test
        /*
        2	3	5	7	11	13	17	19	23	29
            31	37	41	43	47	53	59	61	67	71
         */
    }
}
