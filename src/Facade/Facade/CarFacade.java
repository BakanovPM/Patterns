package Facade.Facade;

import Facade.Parts.Door;
import Facade.Parts.Wheel;
import Facade.Parts.Zazhiganie;

public class CarFacade {
    private final Door door = new Door();
    private final Zazhiganie zazhiganie = new Zazhiganie();
    private final Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
