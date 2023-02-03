package AbstractFactory.FactoryInterfaces;

import AbstractFactory.TransportInterfaces.Aircraft;
import AbstractFactory.TransportInterfaces.Car;

//Фабрика по созданию транспортных средств
public interface TransportFactory {
    // что фабрика будет произодить

    Car createCar();  //машины
    Aircraft createAircraft();  // самолеты
}
