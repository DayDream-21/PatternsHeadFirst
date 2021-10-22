package CompoundPatterns.Factory;

import CompoundPatterns.Ducks.DuckCall;
import CompoundPatterns.Ducks.MallardDuck;
import CompoundPatterns.Ducks.RedheadDuck;
import CompoundPatterns.Ducks.RubberDuck;
import CompoundPatterns.Ducks.Quackable;

public class CommonDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
