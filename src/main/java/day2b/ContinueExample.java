package day2b;

public class ContinueExample {
    public static void main(String[] args) {
        // In ra cac so tu 1-> 100 ngoai tru cac so chia het cho 5

        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                continue;
            }
            System.out.print(i+"\t");
        }


    }
}
