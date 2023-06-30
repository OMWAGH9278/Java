package OOPPart1Inheritance;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Inside constructor with 3 params");
    }

    public Customer() {
        this("Nobody", "nobody@nowhere.com");
        System.out.println("Inside constructor with 0 params");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
        System.out.println("Inside constructor with 2 params");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
