package Calculator.OperationsRun;

import Calculator.Logger.Log;
import Calculator.OperationsInitialization.Mult;
import Calculator.MVP.View;

import java.io.FileWriter;
import java.io.IOException;

/**
 * В классе находится метод, запускающий операцию умножения.
 */
public class RunMult extends Log implements IRun {
    View view;
    Mult mult;

    public RunMult(View view, Mult mult) {
        this.view = view;
        this.mult = mult;
    }

    @Override
    public void runOperation() {
        double x = view.getValue("Введите x: ");
        double y = view.getValue("Введите y: ");
        double res = mult.result(x, y);
        logInfo(x, y, res);
        view.show(res, "Mult = ");
    }

    @Override
    public void logInfo(double x, double y, double result) {
        {
            try (FileWriter writer = new FileWriter("C:\\Users\\Operator\\IdeaProjects\\java_project\\src\\Calculator\\Logger\\log.txt", true)) {
                String text = String.format("%s * %s = %s\n", x, y, result);
                writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


