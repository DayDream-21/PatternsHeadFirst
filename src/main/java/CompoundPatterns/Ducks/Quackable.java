package CompoundPatterns.Ducks;

import CompoundPatterns.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
    String toString();
}

