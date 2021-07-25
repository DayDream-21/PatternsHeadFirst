package Strategy;
/**
 * В данном приложении сипользуется паттерн проектирования
 * "стратегия", который определяет семейство алгоритмов,
 * инкапсулирует и обеспечивает их взаимозаменяемость. Паттерн
 * позволяет модифицировать алгоритмы независимо от их
 * использования на стороне клиента
 * */
public class DuckApp {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}

class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println();
    }
}

