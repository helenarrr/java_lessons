package FamilyOOP;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Children ch1 = new Children("George");
        Children ch2 = new Children("Ben1");
        Children ch3 = new Children("Ben2");
        Children ch4 = new Children("Ben3");
        Grandma grandMa = new Grandma("Dolly");


//        System.out.println(ch1.go(2));
//        ch1.call();
//        ch1.goEat();

        Family<Human> family1 = new Family<>();
        family1.add(ch1);
        family1.add(ch2);
        family1.add(ch3);
        family1.add(ch4);
        family1.add(grandMa);
        System.out.println(family1);




//        Cat cat1 = new Cat("Вислоухий", 2, "темная");
//        Cat cat2 = new Cat("Вислоухий", 6, "темная");
////
//        Iterator<String> components = cat1;
//        while (components.hasNext()) {System.out.println(cat1.next());}

//        List<Cat> cats = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            cats.add(new Cat("id: " + i, "вес: "+ i * 10)); // пока не работает
//        }
//
//        System.out.println(cats);
////      Collections.sort(cats);
//        cats.sort(Comparator.comparingInt(cat -> cat.weight));
//        System.out.println(cats);
//
//        Grandma Meg = new Grandma();
//        System.out.println(Meg.go(6));









    }
}