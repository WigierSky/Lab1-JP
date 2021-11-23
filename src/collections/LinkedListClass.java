package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClass implements All {
    LinkedList<String> linked = new LinkedList<>();

    @Override
    public void adding(String addon) {
        linked.add(addon);
    }

    @Override
    public void deleting(String deleter) {
        linked.remove(deleter);
    }

    @Override
    public void show() {
        System.out.println(linked.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji LinkedList można dodać indentyczne elementy");
        System.out.println("Kolekcja ta zapisuje elementy w kolejności dodawania");
        System.out.println("Elementy można również usuwać podając numer indeksu elementu lub poprostu usunąć pierwszy element tablicy");
    }
}
