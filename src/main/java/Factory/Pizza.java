package Factory;

public abstract class Pizza {
    String name;
    /*Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;*/

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStoreBox");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*@Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }*/
}

class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        /*dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();*/
    }
}

class ClamPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        /*dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        clams = ingredientsFactory.createClams();*/
    }
}
