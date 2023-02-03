package Singleton;

public class TestSingleton {

    private static TestSingleton instance;


    //Даем возможность создать (или вернуть если он уже создан) обьект через мето getInstance()
    // Для однопоточных приложений
    // Ленивая инициализация - создание обьекта по требованию
    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

//    Для многопоточных приложений нужно синхронизировать потоки
//    public static synchronized TestSingleton getInstance() {
//        if (instance == null) {
//            instance = new TestSingleton();
//        }
//        return instance;
//    }


    //Важно конструктор имеет модификатор доступа private
    private TestSingleton() {
    }

    public void print() {
        System.out.println(this);
    }
}
