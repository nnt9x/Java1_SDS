package day3b.donggoi;

public class Student {
    // default
    private String id;

    public String name;
    String address;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId(){
        return id;
    }


}
