package FactoryMethod;

//Порождающий паттерн проектирования
//Фабричный метод (виртуальный конструктор)
//Известен интерфейс, но заранее неизвестно какая из реализаций будет использоваться
//Получение ссылки на обьект в зависимости от входящих условий
public class Start {
    public static void main(String[] args) {

        CarSelection carSelection = new CarSelection();
        Car car = carSelection.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelection.getCar(RoadType.LAWN);
        car.drive();
        car.stop();

        car = carSelection.getCar(RoadType.CITY);
        car.drive();
        car.stop();

    }
}
