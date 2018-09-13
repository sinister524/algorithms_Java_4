package ru.geekbrains.algorithmsJava4;

public class Main {

    public static void main(String[] args) {
        LinkedList <String> cats = new LinkedList<>();
        cats.insert("Cissi");
        cats.insert("Barsick");
        cats.insert("Valera");

        System.out.println(cats.find("Cissi"));
        System.out.println(cats.isEmpty());
        System.out.println(cats.hashCode());
        cats.display();
        System.out.println(" ");
        cats.delete();
        System.out.println(" ");
        cats.display();

        LinkedList <Animals> dogs = new LinkedList<>();
        dogs.insert(new Animals("Ronald", 12));
        dogs.insert(new Animals("Dereck", 8));
        dogs.display();

    }
}
