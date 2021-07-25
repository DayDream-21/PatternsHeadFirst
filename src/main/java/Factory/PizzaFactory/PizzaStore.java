package Factory.PizzaFactory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory =
                new NYPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } /*else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("New York Style Veggie Pizza");
        }*/ else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("New York Style Clam Pizza");
        } /*else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } */
        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory =
                new NYPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } /*else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }*/ else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } /*else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } */
        return pizza;
    }
}



