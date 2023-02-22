package Calculator.OperationsRun;

import Calculator.Logger.ILog;
import Calculator.Logger.Log;
import Calculator.OperationsInitialization.Div;
import Calculator.MVP.View;

import java.io.FileWriter;
import java.io.IOException;

/**В классе находится метод, запускающий операцию деления.*/
public class RunDiv extends Log implements IRun {
    View view;
    Div div;

    public RunDiv(View view, Div div) {
        this.view = view;
        this.div = div;
    }
    @Override
    public void runOperation() {
        double x = view.getValue("Введите x: ");
        double y = view.getValue("Введите y: ");
        double res = div.result(x, y);
        logInfo(x, y, res);
        view.show(res, "Div = ");
    }

    @Override
    public void logInfo(double x, double y, double result) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Operator\\IdeaProjects\\java_project\\src\\Calculator\\Logger\\log.txt", true))
        {
            String text = String.format("%s / %s = %s\n", x, y, result);
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

