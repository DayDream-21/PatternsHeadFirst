package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueChocolateBoiler; // = new uniqueChocolateBoiler();
    // code execute only with empty boiler
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        // return uniqueChocolateBoiler;
        if (uniqueChocolateBoiler == null) {
            uniqueChocolateBoiler = new ChocolateBoiler();
        }
        return uniqueChocolateBoiler;
    }
    // We check before filling that the heater is empty, and after
    // filling we set flags empty and boiled.
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    // To drain the contents, we check that the heater is not
    // empty, and the mixture is brought to the singing.
    // After draining the flag empty is assigned to true again.
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
    // To boil the mixture, we check that the heater
    // full but not yet heated. After the heating flag is
    // assigned to the boiled is true.
    public void boil() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
