package Cafe;

import java.util.Arrays;

public class Clerk implements ClerkService {
    private String name;
    private double charge;

    public Clerk(String name) {
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public void showMenu() {
        System.out.println("Welcome to our Cafe!");
        System.out.println("Choose coffee from menu");
        System.out.println("---------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " " + menu[i] + " $" + prices[i]);
        }
        System.out.println("---------------------");
    }

    @Override
    public void takeOrder(String order) {
        if (Arrays.asList(menu).contains(order)) {
            System.out.println(order  + " is available.");
        } else {
            System.out.println(order + " is not available.");
            System.exit(0);
        }

    }

    @Override
    public void calculate(String order, double money) {
        int index = Arrays.asList(menu).indexOf(order);
        if (money >= prices[index]) {
            charge += money - prices[index];
            System.out.println("You have enough money. Your order has been accepted.");
        } else {
            System.out.println("You did not pay enough money to get " + order);
            System.exit(0);
        }

    }

    @Override
    public void giveCoffee(String coffee) {
        System.out.println("Here is your " + coffee + "\nHave a nice day!");
    }
}
