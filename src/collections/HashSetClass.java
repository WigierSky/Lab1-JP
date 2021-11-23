package collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetClass implements All {
    HashSet<String> hashs = new HashSet<>();

    @Override
    public void adding(String addon) {
        hashs.add(addon);
    }

    @Override
    public void deleting(String deleter) {
        hashs.remove(deleter);
    }

    @Override
    public void show() {
        System.out.println(hashs.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji HashSet nie można dodać identycznych elementów");
        System.out.println("Kolekcja ta nie zapisuje elementów w żadnej kolejności");
    }
}

