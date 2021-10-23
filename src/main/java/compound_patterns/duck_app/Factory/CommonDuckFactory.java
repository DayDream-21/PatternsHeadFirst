package compound_patterns.duck_app.Factory;

import compound_patterns.duck_app.Ducks.DuckCall;
import compound_patterns.duck_app.Ducks.MallardDuck;
import compound_patterns.duck_app.Ducks.RedheadDuck;
import compound_patterns.duck_app.Ducks.RubberDuck;
import compound_patterns.duck_app.Ducks.Quackable;

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
