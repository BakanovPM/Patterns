package FactoryMethod;

public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("Driven speed 60 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped for 5 sec");
    }
}
