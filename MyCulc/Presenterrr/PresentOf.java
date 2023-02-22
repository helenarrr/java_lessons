package MyCulc.Presenterrr;

import MyCulc.Console.View;
import MyCulc.Model.*;

public class PresentOf<T extends CalcModel> {
    View view;
    CalcModel model;
    SumCalc sumCalc;
    Mult mult;
    Div div;;

    public PresentOf(T m , View view) {
        this.model = m;
        this.view = view;
    }


    public void runOperation1() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double res = sumCalc.result();
        view.show(res, "Sum: ");
    }

    public void runOperation2() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double res = mult.result();
        view.show(res, "Mult: ");
    }

    public void runOperation3() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double res = div.result();
        view.show(res, "Div: ");
    }

    public void buttonClick() {
        int choice = view.getChoice();
        switch (choice) {
            case 1 -> runOperation1();
            case 2 -> runOperation2();
            case 3 -> runOperation3();
        }
    }

}

//class Class{
//
//    PresentOf<SumCalc> ps = new PresentOf<>(new SumCalc(), new View());
//    PresentOf<Mult> pm = new PresentOf<>(new Mult(), new View());
//    PresentOf<Div> pd = new PresentOf<>(new Div(), new View());
//
//}
//

