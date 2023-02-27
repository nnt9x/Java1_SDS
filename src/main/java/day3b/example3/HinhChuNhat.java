package day3b.example3;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat(){}
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuRong * chieuDai;
    }
    // Bo sung
    public String toString(){
        return String.format("HinhChuNhat[chieuDai=%.2f, chieuRong=%.2f]", chieuDai, chieuRong);
    }
}
