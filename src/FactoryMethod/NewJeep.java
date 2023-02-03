package FactoryMethod;

public class NewJeep extends Jeep {
    public void newFunction() {
        System.out.println("New function");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("New Jeep drives");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("New Jeep stops");
    }
}
