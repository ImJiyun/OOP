package Cafe;

public class Barista {
    private String name;

    public Barista(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeCoffee(String coffee) {
        return coffee;
    }
}
