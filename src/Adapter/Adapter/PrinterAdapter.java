package Adapter.Adapter;

import Adapter.Objects.Printer;

import java.util.List;
// Адаптер который совмещает желание клиента и возможности принтера
public class PrinterAdapter implements PageListPrinter {

    // C помощью композиции создаем принтер
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list)
            printer.print(text);
    }
}
