package AbstractFactory.TransportAircraft;

import AbstractFactory.TransportInterfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boeing747 flights");
    }
}
