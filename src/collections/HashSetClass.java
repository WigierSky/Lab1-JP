package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass implements All {
    HashSet<Person> hashs = new HashSet<>();

    @Override
    public void adding(Person addon) {
        hashs.add(addon);
    }

    @Override
    public void deleting(Person deleter) {

        hashs.removeIf(str -> str.fullname().equals(deleter.fullname()));

    }

    @Override
    public void show() {
        Iterator<Person> i = hashs.iterator();
       while(i.hasNext())
       {
           System.out.println(i.next().fullname());
       }

    }

    @Override
    public void info() {
        System.out.println("W kolekcji HashSet nie można dodać identycznych elementów");
        System.out.println("Kolekcja ta nie zapisuje elementów w żadnej kolejności");
    }
}

