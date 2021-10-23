package decorator.star_buzz_coffee;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        return .89;
    }
}
