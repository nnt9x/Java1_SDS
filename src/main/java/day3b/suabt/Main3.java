package day3b.suabt;

public class Main3 {
    public static void main(String[] args) {
        PhuongTien p1 = new PhuongTien();
        p1.setGiaXe(1000);
        p1.setDungTich(90);

        System.out.println(p1);
        System.out.println("Thue truoc ba: " + p1.thueTruocBa());

        PhuongTien p2 = new PhuongTien("honda","SH", "Den",5000,150);
        System.out.println(p2);
        System.out.println("Thue truoc ba: "+p2.thueTruocBa());

        PhuongTien p3 = new PhuongTien();
        p3.setGiaXe(10000);
        p3.setDungTich(300);
        System.out.println(p3);
        System.out.println("Thue truoc ba: "+ p3.thueTruocBa());

    }
}
