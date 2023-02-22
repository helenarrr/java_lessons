package Calculator;

import Calculator.MVP.Model;
import Calculator.MVP.Presenter;
import Calculator.MVP.View;

public class Program {

    public static void main(String[] args) {

        Presenter p = new Presenter(new Model(), new View());
        p.buttonClick();
    }
}
