package com.di.setterinjection;

public class SetterInjection
{
    public static void main(String[] args)
    {
        // Client code
        Engine engine = new Engine();
        Car car = new Car();
        car.setEngine(engine);
        car.start();
    }
}
