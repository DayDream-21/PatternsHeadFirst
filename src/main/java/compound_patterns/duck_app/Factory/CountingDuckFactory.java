package compound_patterns.duck_app.Factory;

import compound_patterns.duck_app.Decorator.QuackCounter;
import compound_patterns.duck_app.Ducks.DuckCall;
import compound_patterns.duck_app.Ducks.MallardDuck;
import compound_patterns.duck_app.Ducks.RedheadDuck;
import compound_patterns.duck_app.Ducks.RubberDuck;
import compound_patterns.duck_app.Ducks.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
