package day5b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        while (true) {
            try {
                // Nhap a /b
                System.out.print("a, b = ");
                int a = Integer.parseInt(in.next());
                int b = Integer.parseInt(in.next());
                in.nextLine();

                double tmp = a / b;
                System.out.println("a/ b= " + tmp);
                in.close();
                break;
            } catch (ArithmeticException e) {
                System.out.println("Lỗi chia cho 0");
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!");
            } catch (Exception e) {
                System.out.println("Có lỗi xảy : ");
                e.printStackTrace();
            }
        }
        // ArithmeticException
        // InputMismatchException
        // NumberFormatException
    }

}
