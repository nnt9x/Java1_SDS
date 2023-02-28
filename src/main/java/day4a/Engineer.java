package day4a;

public class Engineer extends Employees {
   private String products;
   private String team;

    public Engineer() {
    }

    public Engineer(String name, String address, String department, String products, String team) {
        super(name, address, department);
        this.products = products;
        this.team = team;

    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
