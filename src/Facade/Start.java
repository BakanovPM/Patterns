package Facade;


import Facade.Facade.CarFacade;
import Facade.Parts.Door;
import Facade.Parts.Wheel;
import Facade.Parts.Zazhiganie;

// Скрыть сложную внутреннюю реализацию и предоставить простой интферфейс
public class Start {
    public static void main(String[] args) {

        //Без использования фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        //С использованием фасада
        CarFacade car = new CarFacade();
        car.go();



    }
}
