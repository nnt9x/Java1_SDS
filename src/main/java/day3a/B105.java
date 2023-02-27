package day3a;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class B105 {
    // Input: so, output: String
    public static String soSangChu(int n){
        String[] so = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
        if(n < 0 || n > 99){
            return "Không thể thực hiện!";
        }
        if(n < 10){
            return so[n];
        }
        // Con lai la lon hon 10 -> 99
        // Xac dinh chuc va don vi
        // VD: n = 21
        int chuc = n / 10; // 2
        int donVi = n % 10; // 1

        // Tao 1 chuoi rong de luu cach doc
        String tmp = "";
        // Xu ly hang chuc, don vi
        if(chuc == 1){
            tmp += "Mười";
            if(donVi == 1){
                tmp += " một";
            }
            else if(donVi == 5){
                tmp += " lăm";
            }
            else if(donVi != 0){
                tmp += so[donVi];
            }
        }
        else{
            tmp = tmp + so[chuc] + " mươi";
            if(donVi == 1){
                tmp += " mốt";
            }
            else if(donVi == 5){
                tmp += " lăm";
            }
            else if(donVi != 0){
                tmp = tmp + " "+ so[donVi];
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println(soSangChu(0));
        System.out.println(soSangChu(99));
        System.out.println(soSangChu(11));
        System.out.println(soSangChu(25));
        System.out.println(soSangChu(20));
    }
}
