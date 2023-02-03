package AbstractFactory.TransportAircraft;

import AbstractFactory.TransportInterfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU134 flights");
    }
}
