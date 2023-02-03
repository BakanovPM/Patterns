package AbstractFactory;

//Порождающий паттерн проектирования
//Более обьемный и чаще используемый чем просто фабрика
//Возращает семейство обьектов разных типов

//Когда нужно создать семейство обьектов а обьекты могут быть разных типов

import AbstractFactory.Factory.RussianFactory;
import AbstractFactory.Factory.USAFactory;
import AbstractFactory.FactoryInterfaces.TransportFactory;
import AbstractFactory.TransportInterfaces.Aircraft;
import AbstractFactory.TransportInterfaces.Car;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {

        boolean choice = false;

        if (choice)
            factory = new RussianFactory();
        else
            factory = new USAFactory();

        Car car = factory.createCar();
        Aircraft aircraft = factory.createAircraft();

        car.drive();
        car.stop();

        aircraft.flight();

    }
}
