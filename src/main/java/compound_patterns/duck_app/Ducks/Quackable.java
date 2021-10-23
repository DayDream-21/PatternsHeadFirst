package compound_patterns.duck_app.Ducks;

import compound_patterns.duck_app.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
    String toString();
}

