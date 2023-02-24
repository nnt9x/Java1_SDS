package day1b;

import java.util.Scanner;

public class ThoiTiet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập thời tiết: ");
        String s = in.nextLine();
        // Chuyển viết hoa hoặc thường toàn bộ
        s = s.toLowerCase();
        if(s.equals("mua")){
            System.out.println("Nghi hoc thể dục!");
        }
        else{
            System.out.println("Hoc binh thuong!");
        }

    }
}
