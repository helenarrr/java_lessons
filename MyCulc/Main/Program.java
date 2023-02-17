package MyCulc.Main;


import MyCulc.Console.View;
import MyCulc.Model.Div;
import MyCulc.Model.Mult;
import MyCulc.Model.SumCalc;
import MyCulc.Presenterrr.PresentOf;

public class Program {

    public static void main(String[] args) {

        PresentOf<SumCalc> ps = new PresentOf<>(new SumCalc(),new View());
        ps.buttonClick();

    }
}


