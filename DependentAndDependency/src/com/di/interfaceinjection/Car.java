package com.di.interfaceinjection;

public class Car
{
    // The Car has a dependency on an Engine
    private Engine engine;

    // Dependency is provided through the method defined in the interface
    // a constructor so that the spring container can inject a Engine
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void start()
    {
        engine.run();
    }
}

