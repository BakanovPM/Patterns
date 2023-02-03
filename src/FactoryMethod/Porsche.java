package FactoryMethod;


public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Driven speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped for 1 sec");
    }
}

