package factory;

public interface PizzaIngredientsFactory {
    /*public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();*/
}

class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {

    /*@Override
    public Dough createDough() {
        return new ThinCrustDough();
    }*/

    /*@Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }*/

    /*@Override
    public Cheese createCheese() {
        return ReggianoCheese();
    }*/

    /*@Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onoin(), new Mushroom(), new RedPepper() };
        return veggies;
    }*/

    /*@Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }*/

    /*@Override
    public Clams createClams() {
        return new FreshClams();
    }*/
}

class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

    /*@Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }*/
}