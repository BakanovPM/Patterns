package AbstractFactory.Factory;

import AbstractFactory.FactoryInterfaces.TransportFactory;
import AbstractFactory.TransportAircraft.Boeing747;
import AbstractFactory.TransportCar.Porsche;
import AbstractFactory.TransportInterfaces.Aircraft;
import AbstractFactory.TransportInterfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
