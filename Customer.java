package Cafe;

public class Customer {
    String name;
    private double budget;

    public Customer(String name) {
        this.name = name;
        this.budget = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String order(String order) {
        return order;
    }

    public double pay(double payment) {
        if (payment > budget) {
            throw new IllegalArgumentException(name + "cannot pay more than budget");
        }
        budget -= payment;
        return payment;
    }

    public void printBudget() {
        System.out.println(name + "'s budget is now $" + budget);
    }
}
