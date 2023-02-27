package day2bt;

import java.util.Scanner;

public class B111a {
    public static void main(String[] args) {
        // Chiều cao h = 4, tối đa là 7 kí tự (2*h - 1)
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu cao h = ");
        int h = in.nextInt();
        in.close();
        // Tinh so ki tu toi da
        int m = 2 * h - 1;

        // h = 4 -> lap 4 lan
        for(int i = 1; i <= h; i++){
            // Can in ra chi tiet tung dong
            // Tim ra vi tri in dau * -> comn lai thi in khoang trang
            // Dong 1: vi tri [h-0; h+0]
            // Dong 2:  [h-1, h+1]
            // Dong 3: [h-2, h+2]
            // Dong 4: [h-3; h+3]
             for (int j = 1; j <=  m; j++){
                 int k = i - 1;
                 if(j >= (h - k) &&  j <= (h + k)){
                     System.out.print("$\t");
                     continue;
                 }
                 System.out.print(" \t");
             }
             // Xuong dong trong moi vong lap
            System.out.println();
        }
    }
}
