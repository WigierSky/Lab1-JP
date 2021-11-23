package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass implements All {
    ArrayList<String> array = new ArrayList();

    @Override
    public void adding(String addon) {
       array.add(addon);
    }

    @Override
    public void deleting(String deleter) {
        array.remove(deleter);
    }

    @Override
    public void show() {
        System.out.println(array.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji ArrayList można zapisywać identyczne elementy.");
        System.out.println("Kolekcja ArrayList zapisuje elementy w kolejności dodawania");
        System.out.println("Poszczególne elementy można również usuwać podając jego indeks");
    }
}
