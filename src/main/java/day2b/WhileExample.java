package day2b;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        // Viết 1 chương trinh xac thuc tai khoan
        // Mac dinh: admin, admin
        // Nguời dùng sẽ được nhập tối đa 3 lần.
        // Nếu thành công-> in thông "chào mừng"
        // Thất bại -> in ra "user hoặc pass không đúng"
        // Khi hết 3 lượt -> "đăng nhập thất bại" -> thoát CT

        // CV lăpj lại là gì? Khi nào kết thúc
        // Lặp lại: nhập dữ liệu + kiểm tra
        // Dưng khi: khi user name hoac pass trung hoặc hết 3 lượt

        Scanner in = new Scanner(System.in);
        boolean isLoginSuccess = false;

        int count = 0;
        while (count < 3) {
            // Tang bien dem len 1 don vi
            count++;
            // Nhap username, pw
            System.out.print("Enter username: ");
            String userName = in.nextLine();
            System.out.print("Enter password: ");
            String pw = in.nextLine();
            // Kiem tra xem co hop le hay ko?
            if (userName.equals("admin") && pw.equals("admin")) {
                System.out.println("Chào mừng");
                isLoginSuccess = true;
                // Thoát khỏi vòng lặp
                break;
            }
        }
        if (!isLoginSuccess) {
            System.out.println("Đăng nhập thất bại!");
        }
        in.close();
    }
}
