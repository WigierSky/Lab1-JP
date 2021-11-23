package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapClass implements All{
    TreeMap<Integer, Person> treem = new TreeMap<>();

    @Override
    public void adding(Person addon) {
        System.out.println("Podaj unikalny klucz elementu który chcesz dodać");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        treem.put(x, addon);
    }

    @Override
    public void deleting(Person deleter) {
        System.out.println("Podaj unikalny klucz elementu który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        treem.remove(x);
    }

    @Override
    public void show() {
        Iterator<Person> i = treem.values().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next().fullname());
        }

    }

    @Override
    public void info() {
        System.out.println("W kolekcji TreeMap nie można dodawać identycznych elementów");
        System.out.println("Kolekcja ta przechowuje elementy w kolejności wyznaczanej przez klucze przypisane do elementów");
    }
}
