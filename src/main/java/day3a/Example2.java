package day3a;

public class Example2 {

    // loai 1: ko co tham so, ko co gia tri tra ve
    public static void sayHello(){
        System.out.println("Hello");
    }
    // loai 2: ko co tham so, co gia tri tra ve

    public static double getPI(){
        return 3.14;
    }
    // loai 3: co tham so, nhung ko co gia tri tra ve
    public static void chuViHT(double r){
        double cv = 2 * 3.14 * r;
        System.out.println("Chu vi: "+ cv);
    }
    // loai 4: co tham so va co gia tri tra ve
    public static double dienTichHT(double r){
        double dt = getPI()* r * r;
        return dt;
    }

    public static void main(String[] args) {
        sayHello();
        sayHello();

        double myPi = getPI();
        System.out.println("Chu vi ht r = 2: " + (myPi*2*2));

        chuViHT(5);
        chuViHT(7);


    }
}
