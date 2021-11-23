package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapClass implements All{

    HashMap<Integer, Person> hashm = new HashMap<>();
    @Override
    public void adding(Person addon) {
        System.out.println("Podaj unikalny klucz, który zostanie przypisany do elementu który chcesz dodać");
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        hashm.put(x, addon);
    }

    @Override
    public void deleting(Person deleter) {
        System.out.println("Podaj unikalny klucz elementu, który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        Integer y = scanner.nextInt();
        hashm.remove(y);
    }

    @Override
    public void show() {
        Iterator<Person> i = hashm.values().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next().fullname());
        }
    }

    @Override
    public void info() {
        System.out.println("W kolekcji HashMap można dodać identyczne elementy, jednak trzeba im przypisać inny klucz");
        System.out.println("Kolekcja ta zapisuje elementy w kolejności podawanej przez klucze.");
    }
}
