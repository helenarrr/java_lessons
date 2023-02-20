package Calculator;

import java.util.Scanner;

/**В классе происходит считывание варианта операции от пользователя.*/
public class Choice {

    Scanner sc = new Scanner(System.in);

    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Sum ");
        System.out.println("\t2. Mult ");
        System.out.println("\t3. Div ");
        return sc.nextInt();
    }
}
