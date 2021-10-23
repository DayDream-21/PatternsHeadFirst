package compound_patterns.duck_app.Observer;

public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.toString() + " just quacked.");
    }
}
