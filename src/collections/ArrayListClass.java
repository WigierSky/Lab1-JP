package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass implements All {
    ArrayList<Person> array = new ArrayList<>();

    @Override
    public void adding(Person addon) {
       array.add(addon);
    }

    @Override
    public void deleting(Person deleter) {
        array.removeIf(str -> str.fullname().equals(deleter.fullname()));
    }

    @Override
    public void show() {
        Iterator<Person> i = array.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next().fullname());
        }

    }

    @Override
    public void info() {
        System.out.println("W kolekcji ArrayList można zapisywać identyczne elementy.");
        System.out.println("Kolekcja ArrayList zapisuje elementy w kolejności dodawania");
        System.out.println("Poszczególne elementy można również usuwać podając jego indeks");
    }
}
