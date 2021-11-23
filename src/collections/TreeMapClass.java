package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapClass implements All{
    TreeMap<Integer, String> treem = new TreeMap<>();

    @Override
    public void adding(String addon) {
        System.out.println("Podaj klucz elementu który chcesz dodać");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        treem.put(x, addon);
    }

    @Override
    public void deleting(String deleter) {
        System.out.println("Podaj klucz elementu który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        treem.remove(x);
    }

    @Override
    public void show() {
        System.out.println(treem.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji TreeMap nie można dodawać identycznych elementów");
        System.out.println("Kolekcja ta przechowuje elementy w kolejności wyznaczanej przez klucze przypisane do elementów");
    }
}
