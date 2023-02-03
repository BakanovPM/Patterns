package AbstractFactory.TransportCar;

import AbstractFactory.TransportInterfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drives");
    }

    @Override
    public void stop() {
        System.out.println("Niva stops");

    }
}
