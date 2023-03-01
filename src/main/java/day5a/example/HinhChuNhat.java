package day5a.example;

import java.util.Scanner;

public class HinhChuNhat implements HinhHoc{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(){}

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong)*2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    @Override
    public void initFromKeyBoard(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        chieuDai = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chiều rộng: ");
        chieuRong = Double.parseDouble(scanner.nextLine());

    }
}
