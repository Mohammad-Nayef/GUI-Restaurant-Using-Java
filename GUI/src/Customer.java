
public class Customer {

    private String name;
    private double accountValue;

    public Customer() {

    }

    public Customer(String name, double accountValue) {
        this.name = name;
        this.accountValue = accountValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    String getCustomer() {
        return "Name: " + name + "\nAccount value: " + accountValue;
    }
}
