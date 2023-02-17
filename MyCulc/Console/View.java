package MyCulc.Console;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public double getValue(String data) {
        System.out.println(data);
        return sc.nextDouble();
    }
    public void show(double value, String data) { System.out.printf("%s %s", data, value); }


    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Sum ");
        System.out.println("\t2. Mult ");
        System.out.println("\t3. Div ");
        return sc.nextInt();
    }

}
