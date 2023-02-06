package FamilyOOP;

public class Program {
    public static void main(String[] args) {
        Children George = new Children();
        System.out.println(George.go(2));
        George.call();
        George.goEat();

        Grandma Meg = new Grandma();
        System.out.println(Meg.go(6));



    }
}