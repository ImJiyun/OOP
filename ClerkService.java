package Cafe;

public interface ClerkService {
    public final String[] menu = {"Americano", "Espresso", "Matcha", "Latte"};
    public final double[] prices = {4.99, 5.99, 5.2, 4.5};

    public void showMenu();
    public void takeOrder(String order);
    public void calculate(String order, double money);
    public void giveCoffee(String coffee);

}
