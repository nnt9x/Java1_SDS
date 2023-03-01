package day5a.example;


// Them class HinhTamGiac, class LucGiacDeu

public class Main {
    public static void main(String[] args) {
        HinhHoc[] hinhHocs = new HinhHoc[3];

        hinhHocs[0] = new HinhTron(3);
        hinhHocs[1] = new HinhVuong(4);
        hinhHocs[2] = new HinhChuNhat(5, 6);


        // In ra tat cac hinh
        for (HinhHoc h:  hinhHocs) {
            System.out.println(h);
        }

        // In ra hinh co chu vi lon nhat
        double cvMax = hinhHocs[0].tinhChuVi();
        int vtMax = 0;

        for(int i = 1; i < hinhHocs.length; i++){
            if(cvMax < hinhHocs[i].tinhChuVi()){
                cvMax = hinhHocs[i].tinhChuVi();
                vtMax = i;
            }
        }
        System.out.println("Hinh co chu vi lon nhat la : ");
        System.out.println(hinhHocs[vtMax]);


    }
}
