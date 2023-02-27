package day3b.example2;

public class Student {
    // Thuoc tinh
    String name;
    int age;
    String color;
    String sex;

    // Phuong thuc
    public void eating(String s) {
        System.out.println(name + " can eat " + s);
    }

    public void drinking(String s) {
        System.out.println(name + " can drink " + s);
    }

    public void running(String s) {
        System.out.println(name + " can run " + s);
    }
}
