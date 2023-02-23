package day1b;

import java.util.Random;

public class HoanDoiGiaTri {
    public static void main(String[] args) {
        // Tạo ngẫu nhiên x, y
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        // In ra x, y
        System.out.println("Trước khi hoán đổi:");
        System.out.printf("x=%d, y=%d\n", x, y);
        // Taọ biến trung gian
        // Giá trị vế phải -> gán cho vế trái
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("Sau khi hoán đổi:");
        System.out.printf("x=%d, y=%d\n", x, y);
    }
}
