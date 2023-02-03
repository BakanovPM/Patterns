package Adapter;

//Cтруктурный паттерн
//Помогает двум разным интерфейсам работать вместе
//Реализуется 2 способами: наследованием и композицией

import Adapter.Adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

//Наш пример с композицией
public class Start {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);

    }
}
