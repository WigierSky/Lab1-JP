package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass implements All {
    TreeSet<Person> trees = new TreeSet<>();

    @Override
    public void adding(Person addon) {
        trees.add(addon);
    }

    @Override
    public void deleting(Person deleter) {
        trees.removeIf(str -> str.fullname().equals(deleter.fullname()));
    }

    @Override
    public void show() {
        Iterator<Person> i = trees.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next().fullname());
        }

    }

    @Override
    public void info() {
        System.out.println("W kolekcji TreeSet nie można zapisywać identycznych elementów");
    }
}
