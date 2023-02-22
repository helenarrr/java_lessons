package Calculator.MVP;

import java.util.Scanner;

/**В классе происходит работа с интерфейсом, считываются и выводятся данные.*/
public class View {

    Scanner sc = new Scanner(System.in);

    /**Метод позволяет считать данные, получить числа, с которыми можно работать в дальнейшем, складывать и т.д..*/
    public double getValue(String data) {
        System.out.println(data);
        return sc.nextDouble();
    }

    /**Метод выводит данные*/
    public void show(double value, String data) { System.out.printf("%s %s", data, value); }

}
