package Singleton;

public class TestSingletonV2 {

    private static final TestSingletonV2 instance = new TestSingletonV2();

    //Если программа работает с обьектом в нескольких потоках, то не забываем synchronized
    public static TestSingletonV2 getInstance() {
        return instance;
    }

    //Важно конструктор имеет модификатор доступа private
    private TestSingletonV2() {
    }

    public void print() {
        System.out.println(this);
    }
}