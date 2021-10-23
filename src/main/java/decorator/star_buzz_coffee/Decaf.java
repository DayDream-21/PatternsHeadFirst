package decorator.star_buzz_coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }
    public double cost() {
        return 1.05;
    }
}
