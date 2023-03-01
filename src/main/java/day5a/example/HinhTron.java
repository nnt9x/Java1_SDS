package day5a.example;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class HinhTron implements HinhHoc {
    private double banKinh;

    public HinhTron(){}

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }

    @Override
    public void initFromKeyBoard(Scanner scanner) {
        System.out.print("Nhập bán kính: ");
        banKinh = Double.parseDouble(scanner.nextLine());
    }
}
