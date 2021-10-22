package CompoundPatterns;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory commonDuckFactory = new CommonDuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        simulator.simulate(countingDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                 QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
