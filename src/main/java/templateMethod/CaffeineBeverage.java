package templateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
