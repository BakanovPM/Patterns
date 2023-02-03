package Decorator;

import Decorator.Decorators.BorderDecorator;
import Decorator.Decorators.ColorDecorator;
import Decorator.Objects.Button;
import Decorator.Objects.Component;
import Decorator.Objects.TextView;
import Decorator.Objects.Window;

//Структурный паттерн
//Или wrapper обретка
//Расширение функционала обьекта
public class Start {

    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {

        boolean showBorder = true;
        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();


        //Без декоратора
        Component window = new Window();
        window.draw();
        //Использование декоратора
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();
        //Вложенность декораторов
        Component windowWithColorWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithColorWithBorder.draw();

        Component textView = new ColorDecorator(new TextView());
        textView.draw();
    }
}
