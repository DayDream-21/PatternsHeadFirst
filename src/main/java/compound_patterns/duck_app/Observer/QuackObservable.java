package compound_patterns.duck_app.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
