package com.di.setterinjection;

public class Car
{
    private Engine engine;

    // Default constructor
    public Car() {}

    // Dependency is provided through the setter method
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void start()
    {
        engine.run();
    }
}
