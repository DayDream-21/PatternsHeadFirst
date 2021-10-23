package compound_patterns.duck_app.Adapter;

import compound_patterns.duck_app.Observer.Observable;
import compound_patterns.duck_app.Observer.Observer;
import compound_patterns.duck_app.Ducks.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "GooseAdapter";
    }
}
