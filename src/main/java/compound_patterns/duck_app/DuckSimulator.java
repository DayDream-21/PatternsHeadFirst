package compound_patterns.duck_app;

import compound_patterns.duck_app.Adapter.Goose;
import compound_patterns.duck_app.Adapter.GooseAdapter;
import compound_patterns.duck_app.Composite.Flock;
import compound_patterns.duck_app.Decorator.QuackCounter;
import compound_patterns.duck_app.Factory.AbstractDuckFactory;
import compound_patterns.duck_app.Factory.CountingDuckFactory;
import compound_patterns.duck_app.Factory.CommonDuckFactory;
import compound_patterns.duck_app.Ducks.Quackable;
import compound_patterns.duck_app.Observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory commonDuckFactory = new CommonDuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        simulator.simulate(countingDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
