package Cafe;

public class Cafe {
    public static void main(String[] args) {
        Clerk alex = new Clerk("Alex");
        Customer cassie = new Customer("Cassie");
        Barista john = new Barista("John");

        alex.showMenu();

        String order = cassie.order("Matcha");
        alex.takeOrder(order);

        double payment = cassie.pay(8);
        alex.calculate(order, payment);
        double moneyAfterPayment = cassie.getBudget() + alex.getCharge();
        cassie.setBudget(moneyAfterPayment);
        cassie.printBudget();

        String coffee = john.makeCoffee(order);
        alex.giveCoffee(coffee);



    }
}
