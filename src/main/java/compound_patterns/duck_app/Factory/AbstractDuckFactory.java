package compound_patterns.duck_app.Factory;

import compound_patterns.duck_app.Ducks.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
