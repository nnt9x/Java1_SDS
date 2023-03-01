package day5a.example;

import java.util.Scanner;

public class HinhVuong implements HinhHoc{

    private double canh;

    public HinhVuong(){}

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

    @Override
    public void initFromKeyBoard(Scanner scanner) {
        System.out.print("Nhập cạnh: ");
        canh = Double.parseDouble(scanner.nextLine());
    }
}
