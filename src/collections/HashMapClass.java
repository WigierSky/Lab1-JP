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
    public void deleting() {
        System.out.println("Podaj unikalny klucz elementu, który chcesz usunąć");
        Scanner scanner = new Scanner(System.in);
        Integer y = scanner.nextInt();
       // System.out.println("Podaj nazwę elementu, który chcesz usunąć");
        //String deleter = scanner.next();
        hashm.remove(y);
    }

    @Override
    public void show() {
        System.out.println(hashm.clone());
    }
}
