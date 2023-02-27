package day3a;

public class B116 {

    // Input, Output
    // Neu ko hop le -> output: -1

    public static long tongS(int n){
        if(n < 0){
            return -1;
        }
        long t = 0;
        for(int i = 1; i <= n; i++){
            t = t + i;
        }
        // Luu y: ko nen in
        // System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        System.out.println(tongS(10));

    }
}
