package collections;

import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }
private static void menu(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("------------------------");
    System.out.println("Witaj, wybierz kolekcję:");
    System.out.println("1.HashSet");
    System.out.println("2.HashMap");
    System.out.println("3.ArrayList");
    System.out.println("4.LinkedList");
    System.out.println("5.TreeSet");
    System.out.println("6.TreeMap");
    System.out.println("0.Wyjście");
    System.out.println("------------------------");

    int x = scanner.nextInt();

    switch(x)
    {
        case 1 :
        actions(new HashSetClass());
        case 2:
        actions(new HashMapClass());
        case 3:
        case 4:
        case 5:
        case 6:
        case 0: {
            System.exit(0);
        }
    }
}

public static void actions(All collection){
    Scanner scanner = new Scanner(System.in);
    while(true) {
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Dodaj do kolekcji");
        System.out.println("2. Usuń z kolekcji");
        System.out.println("3. Pokaż co jest w kolekcji");
        System.out.println("4. Zmień kolekcję");
        System.out.println("0.Wyjdź");
        int y = scanner.nextInt();

        switch (y) {
            case 1: {
                System.out.println("Podaj element, który chcesz dodać");
                String string = scanner.next();
                collection.adding(string);
                break;
            }

            case 2:{
                collection.deleting();
                break;
            }

            case 3: {
                collection.show();
                break;
            }

            case 0:{
                System.exit(0);

            }
        }
    }
}

}
