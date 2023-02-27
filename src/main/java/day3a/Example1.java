package day3a;

public class Example1 {

    // static: tĩnh
    public static double chuVi(double a, double b){
        if(a > 0 && b > 0){
            return (a + b) * 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        double t = chuVi(4, 5);
        System.out.println(t);
    }
}
