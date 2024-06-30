package com.di.constructorinjection;

public class Car
{
    private final Engine engine;

    // Dependency is provided through the constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.run();
    }
}
