package collections;

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
            actions(new ArrayListClass());
        case 4:
            actions(new LinkedListClass());
        case 5:
            actions(new TreeSetClass());
        case 6:
            actions(new TreeMapClass());
        case 0: {
            System.exit(0);
        }
    }
}

public static void actions(All collection){
    Scanner scanner = new Scanner(System.in);
    while(true) {
        System.out.println("------------------------");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Dodaj do kolekcji");
        System.out.println("2. Usuń z kolekcji");
        System.out.println("3. Pokaż co jest w kolekcji");
        System.out.println("4. Informacje o kolekcji");
        System.out.println("5. Zmień kolekcję");
        System.out.println("0. Wyjdź");
        System.out.println("------------------------");
        int y = scanner.nextInt();

        switch (y) {
            case 1: {
                System.out.println("Podaj imie");
                String name = scanner.next();
                System.out.println("Podaj nazwisko");
                String surname = scanner.next();
                System.out.println("Podaj wiek");
                int age = scanner.nextInt();
                Person person = new Person(name, surname, age);
                collection.adding(person);
                break;
            }

            case 2:{
                System.out.println("Podaj imie");
                String name = scanner.next();
                System.out.println("Podaj nazwisko");
                String surname = scanner.next();
                System.out.println("Podaj wiek");
                int age = scanner.nextInt();
                Person person = new Person(name, surname, age);
                collection.deleting(person);
                break;
            }

            case 3: {
                collection.show();
                break;
            }

            case 4: {
                collection.info();
                break;
            }

            case 5: {
                menu();
                break;
            }
            case 0:{
                System.exit(0);

            }
        }
    }
}

}
