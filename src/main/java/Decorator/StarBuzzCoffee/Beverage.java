package Decorator.StarBuzzCoffee;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }

    Size size = Size.VENTI;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
