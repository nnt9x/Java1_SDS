package day5a;

public class Dog implements Animal  {
    // Thuoc tinh name, age, color
    private String name;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau gau");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz");
    }
}
