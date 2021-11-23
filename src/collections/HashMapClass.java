package collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapClass implements All{

    HashMap<Integer, String> hashm = new HashMap();
    @Override
    public void adding(String addon) {
        System.out.println("Podaj unikalny klucz, który zostanie przypisany do elementu który chcesz dodać");
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        hashm.put(x, addon);
    }

    @Override
    public void deleting(String deleter) {
        System.out.println("Podaj unikalny klucz elementu, który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        Integer y = scanner.nextInt();
        hashm.remove(y);
    }

    @Override
    public void show() {
        System.out.println(hashm.clone());
    }

    @Override
    public void info() {
        System.out.println("W kolekcji HashMap można dodać identyczne elementy, jednak trzeba im przypisać inny klucz");
        System.out.println("Kolekcja ta zapisuje elementy w kolejności podawanej przez klucze.");
    }
}
