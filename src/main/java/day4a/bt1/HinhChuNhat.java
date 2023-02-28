package day4a.bt1;

public class HinhChuNhat {
    private double chieuDai = 1;
    private double chieuRong = 1;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai > 0 && chieuRong  > 0) {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai > 0) {
            this.chieuDai = chieuDai;
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong > 0) {
            this.chieuRong = chieuRong;
        }
    }

    public double tinhChuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double tinhDienTich(){
        return  chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi="+tinhChuVi()+
                ", dienTich="+tinhDienTich()+
                '}';
    }
}
