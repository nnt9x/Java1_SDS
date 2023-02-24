package day2a;

import java.util.Map;
import java.util.Scanner;

public class B33 {
    public static void main(String[] args) {
        // Buoc 1: Nhap n
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        if(n < 1){
            System.out.println("n phai lon hon 0");
            System.exit(0);
        }
        // Buoc 2: tao n lan lap
        double t = 0;
        for(int i = 1; i <= n; i++){
            t = Math.sqrt(2 + t);
        }
        System.out.println("t = "+ t);

    }
}
