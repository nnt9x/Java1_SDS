package day5a.example;

public class HinhVuong implements HinhHoc{

    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
