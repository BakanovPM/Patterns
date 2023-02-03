package AbstractFactory.TransportCar;

import AbstractFactory.TransportInterfaces.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Porsche drives");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stops");
    }
}
