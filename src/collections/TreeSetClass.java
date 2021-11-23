package collections;

import java.util.TreeSet;

public class TreeSetClass implements All {
    TreeSet<String> tree = new TreeSet<>();

    @Override
    public void adding(String addon) {
        tree.add(addon);
    }

    @Override
    public void deleting(String deleter) {
        tree.remove(deleter);
    }

    @Override
    public void show() {
        System.out.println(tree.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji TreeSet nie można zapisywać identycznych elementów");
    }
}
