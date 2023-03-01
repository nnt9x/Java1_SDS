package day5a;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Pitbull", 2, "Den");
        animals[1] = new Bird1("Bo cau");

        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getClass().getSimpleName());
            animals[i].makeSound();
        }



    }
}
