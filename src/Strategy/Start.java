package Strategy;


import Strategy.Auth.UserChecker;
import Strategy.Strategy.DBAuth;
import Strategy.Strategy.FileAuth;

import java.io.File;

//Выбрать одного из семейства алгоритмов дле выполения дейсвтия
//Пример сортировка (метод один но передвая разыне компораторы сортирует по разному)
//Не зависит от конкретных реализаций
public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("c:\file.txt")));
    }
}
