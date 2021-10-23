package decorator.star_buzz_coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    public double cost() {
        return .99;
    }
}
