package day2a;

public class BT34 {
    public static void main(String[] args) {
        double t = 0;
        int n = 10;

        for (int i = 1; i <= n; i++){
            t = Math.sqrt(t + i);
        }
        System.out.println("t  = "+ t);
    }
}
