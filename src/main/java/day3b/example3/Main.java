package day3b.example3;

public class Main {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        /*
        // Tao h1
        HinhChuNhat h1 = new HinhChuNhat();
        h1.chieuDai = 5;
        h1.chieuRong = 6;

        // Tao h2
        HinhChuNhat h2 = new HinhChuNhat(6, 7);

        // Tinh chu vi, dien tich
        System.out.println(h1.dienTich());
        System.out.println(h2.chuVi());

         */

        // Tao mang luu 10  hinh chu nhat
        HinhChuNhat[] arr = new HinhChuNhat[10];
        for (int i = 0; i < 10; i++){
            double chieuDai = getRandomNumber(10, 20);
            double chieuRong = getRandomNumber(20, 30);
            arr[i] = new HinhChuNhat(chieuDai, chieuRong);
            System.out.println(arr[i].toString());
        }
        // Tim hinh chu nhat co dien tich lon nhat
        double dtMax = arr[0].dienTich();
        int vtMax = 0;

        for(int i = 1; i < 10; i++){
            if(dtMax < arr[i].dienTich()){
                vtMax = i;
                dtMax = arr[i].dienTich();
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat: ");
        System.out.println(arr[vtMax].toString());

    }
}
