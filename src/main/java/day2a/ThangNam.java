package day2a;

import java.util.Scanner;

public class ThangNam {
    public static void main(String[] args) {
        // Buoc 1: Nhap nam thang
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap nam, thang: ");
        int year = in.nextInt();
        int month = in.nextInt();
        in.close();
        // Kiem tra tinh hop le
        if(year < 0){
            System.out.println("Nam khong hop le");
            System.exit(0);
        }
        if(month < 1 || month > 12){
            System.out.println("Thang khong hop le");
            System.exit(0);
        }
        // Buoc 2: Kiem tra
        // TH1: 1,3,5,7,8,10,12 -> 31 ngay
        // TH2: 2 (28, 29)
        // TH3: 30 ngay la cac thang con lai (4, 6, 9, 11)

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Co 30 ngay!");
                break;
            case 2:
                // Kiem tra nhuan hay ko
                if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
                    System.out.println("Co 29 ngay");
                }
                else{
                    System.out.println("Co 28 ngay");
                }
                break;
            default:
                System.out.println("Co 31 ngay");
        }

    }
}
