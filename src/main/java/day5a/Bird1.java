package day5a;

public class Bird1 implements Bird{
    // Thuoc tinh
    private String name;

    public Bird1() {
    }

    public Bird1(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Tieng chim keu!");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz");
    }

    @Override
    public void fly() {
        System.out.println("Co the bay");
    }
}
