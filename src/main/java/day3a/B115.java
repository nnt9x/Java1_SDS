package day3a;

public class B115 {

    public static void inThongTin(String hoTen, double diemToan, double diemVan){
        if(diemVan <0 || diemVan > 10 || diemToan < 0 || diemToan > 10){
            System.out.println("Không hợp lệ!");
            return;
        }
        double tb = (diemVan + diemToan)/2;
        System.out.printf("HocSinh[hoTen: %s, diemTB: %.2f] \n", hoTen, tb);
    }
    public static void main(String[] args) {
        inThongTin("Nguyen Van A", 8, 9);
        inThongTin("Nguyen Van B", 5, -2);
    }

}
