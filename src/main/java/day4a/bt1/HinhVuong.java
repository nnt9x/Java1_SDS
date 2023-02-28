package day4a.bt1;

public class HinhVuong extends HinhChuNhat {
    private double canh = 1;

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
