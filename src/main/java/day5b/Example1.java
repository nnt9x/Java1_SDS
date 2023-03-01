package day5b;

import day2a.Ex;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Nhập tên: ");
            name = in.nextLine();
            System.out.print("Nhập tuổi: ");
            age = Integer.parseInt(in.nextLine());

            if(age < 18 || age > 30){
                throw new RuntimeException("Tuổi đăng kí không phù hợp!");
            }
            System.out.println("Đăng kí thành công!");
        }
        catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng tuổi!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
