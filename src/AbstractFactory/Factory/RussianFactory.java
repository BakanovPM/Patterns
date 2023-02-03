package AbstractFactory.Factory;

import AbstractFactory.FactoryInterfaces.TransportFactory;
import AbstractFactory.TransportAircraft.TU134;
import AbstractFactory.TransportCar.Niva;
import AbstractFactory.TransportInterfaces.Aircraft;
import AbstractFactory.TransportInterfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
