package com.di.constructorinjection;

public class ConstructorInjection
{
    public static void main(String[] args)
    {
        // Client code
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
    }
}
