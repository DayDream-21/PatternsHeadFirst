package compound_patterns.duck_app.Composite;

import compound_patterns.duck_app.Observer.Observer;
import compound_patterns.duck_app.Ducks.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : quackers) {
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : quackers) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}
