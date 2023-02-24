package day2c;

public class Mang1D {
    public static void main(String[] args) {
        // Tao mang so nguyen

        // C1: Tao mang truc tiep
        int[] arr1 = {1, 2, 3, 4, 10};

        // Duyet mang, for, while
        for(int i = 0; i < arr1.length; i++){
            System.out.printf("arr[%d] = %d \n",i, arr1[i]);
        }
        System.out.println();
        // C2: Tao mang rong gom n phan tu
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++){
            System.out.printf("arr[%d] = %d \n",i, arr2[i]);
        }
        // Tao ra mot mang so thuc double ngau nhien gom co n phan tu
        // Sau do in ra phan tu co gia tri lon nhat

    }
}
