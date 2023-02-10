package FamilyOOP;


import java.util.*;

public class Program {
    public static void main(String[] args) {
        Children George = new Children();
        System.out.println(George.go(2));
        George.call();
        George.goEat();

        Cat cat1 = new Cat("Вислоухий", 2, "темная");
        Cat cat2 = new Cat("Вислоухий", 6, "темная");

        Iterator<String> components = cat1;
        while (components.hasNext()) {System.out.println(cat1.next());}

//        List<Cat> cats = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            cats.add(new Cat("id: " + i, "вес: "+ i * 10)); // пока не работает
//        }
//
//        System.out.println(cats);
////        Collections.sort(cats);
//        cats.sort(Comparator.comparingInt(cat -> cat.weight));
//        System.out.println(cats);

        Grandma Meg = new Grandma();
        System.out.println(Meg.go(6));





    }
}