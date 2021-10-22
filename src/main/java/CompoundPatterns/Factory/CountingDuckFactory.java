package CompoundPatterns.Factory;

import CompoundPatterns.Decorator.QuackCounter;
import CompoundPatterns.Ducks.DuckCall;
import CompoundPatterns.Ducks.MallardDuck;
import CompoundPatterns.Ducks.RedheadDuck;
import CompoundPatterns.Ducks.RubberDuck;
import CompoundPatterns.Ducks.Quackable;

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
