package FactoryMethod;

// фабрика по созданию автомобилей
public class CarSelection {

    //Можно назвать фабричным методом - создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;

            case OFF_ROAD:
                car = new Jeep();
                break;

            case LAWN:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
