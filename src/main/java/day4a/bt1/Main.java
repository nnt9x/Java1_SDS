package day4a.bt1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        System.out.println(hcn.toString());

        HinhVuong hv = new HinhVuong(4);
        hv.setChieuDai(5);
        hv.setChieuRong(6);

        System.out.println(hv);
    }
}
