package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClass implements All {
    LinkedList<Person> linked = new LinkedList<>();

    @Override
    public void adding(Person person) {
        linked.add(person);
    }

    @Override
    public void deleting(Person deleter) {
        linked.removeIf(str -> str.fullname().equals(deleter.fullname()));
    }

    @Override
    public void show() {
        Iterator<Person> i = linked.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next().fullname());
        }

    }

    @Override
    public void info() {
        System.out.println("W kolekcji LinkedList można dodać indentyczne elementy");
        System.out.println("Kolekcja ta zapisuje elementy w kolejności dodawania");
        System.out.println("Elementy można również usuwać podając numer indeksu elementu lub poprostu usunąć pierwszy element tablicy");
    }
}
