package MyCulc.Presenterrr;

import MyCulc.Console.View;
import MyCulc.Model.CalcModel;
import MyCulc.Model.Div;
import MyCulc.Model.Mult;

public class Presenter {
    View view;
    CalcModel model;
    Mult mult;
    Div dv;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;
    }
    public void buttonClick() {
        double x = view.getValue("Введите x: ");
        double y = view.getValue("Введите y: ");
        model.setX(x);
        model.setY(y);
        double res = model.result();
        view.show(res, "Sum = ");
    }
}
