package day2a;

public class ForExample {
    // In ra cac so tu 1-> 100
    public static void main(String[] args) {
        // i++  <=> i=i+1
        for(int i = 1; i <= 100; i++){
            System.out.print(i+"\t");
        }
        System.out.println("\n");
        // In ra cac so le tu 1->100
        for(int i = 1; i <= 100; i = i +2){
            System.out.print(i+"\t");
        }
        // Tinh tong cac so tu 1 -> 1000
        // Input: 1..1000
        // Output: tong
        // Cong viec lap lai la gi? Khi nao ket thuc?

        // 1 + 2 +3 + 4
        long t = 0;
        for(int j = 1; j <= 1000; j++){
            t = t + j;
        }
        System.out.printf("T = %d\n", t);

    }
}
