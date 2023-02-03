package Singleton;

//Порождающий паттерн проектирования
public class Start {
    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();

        TestSingletonV2.getInstance().print();
        TestSingletonV2.getInstance().print();
        TestSingletonV2.getInstance().print();

        //Так создать обьект не получится так как конструктор приватный
        //TestSingleton testSingleton = new TestSingleton();

    }
}
