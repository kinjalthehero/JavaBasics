package Composition;

public class Car {

    public final Engine engine;

    public Car () {
        engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }
}
