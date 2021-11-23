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
    public void deleting() {
        System.out.println("Podaj element, który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        String deleter = scanner.next();
        hashs.remove(deleter);
    }

    @Override
    public void show() {
        System.out.println(hashs.clone());
    }
}

