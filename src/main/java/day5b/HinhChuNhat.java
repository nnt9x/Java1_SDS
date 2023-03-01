package day5b;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong)  {
        if(chieuDai <= 0 || chieuRong <= 0){
            throw new RuntimeException("Cạnh phải dương");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai)  {
        if(chieuDai <= 0){
            throw new RuntimeException("Cạnh phải dương");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <= 0){
            throw new RuntimeException("Cạnh phải dương");
        }
        this.chieuRong = chieuRong;
    }

    public double chuVi(){
        return (chieuDai + chieuRong) * 2;
    }
    public double dienTich(){
        return chieuDai * chieuRong;
    }
}
