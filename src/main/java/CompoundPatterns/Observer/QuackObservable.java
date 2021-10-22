package CompoundPatterns.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
