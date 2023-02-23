package day1a;

public class Helloworld {
    public static void main(String[] args) {
        // Code thực thi chính
        // print line
        System.out.println("Hello world");
        // In thêm các thông sau: họ tên, nơi làm việc
        // Thay thế println bằng print -> đưa nhận xét
        // sout
        // Print - mặc định ko xuống dòng
        System.out.print("Nguyễn Văn A ");
        System.out.print("BKACAD");

        // Print format
        // VD: in ten va tuoi
        String name = "User 1";
        int age = 20;
        // \n: new line
        System.out.printf("\nHọ tên: %s, năm nay %d tuổi", name, age);
        // \t: tab
        System.out.println("\nHello\tworld");

        /*
        Nhập họ tên và năm sinh từ bàn phím
        -> In ra họ tên và tuổi trên 1 dòng theo format sau:
        "Tôi tên là ..., năm nay tôi ... tuổi"
         */
    }
}
