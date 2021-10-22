package CompoundPatterns.Decorator;

import CompoundPatterns.Observer.Observable;
import CompoundPatterns.Observer.Observer;
import CompoundPatterns.Ducks.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    Observable observable;

    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        notifyObservers();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
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
        return duck.toString();
    }
}
