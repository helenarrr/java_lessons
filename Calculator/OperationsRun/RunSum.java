package Calculator.OperationsRun;

import Calculator.Logger.Log;
import Calculator.OperationsInitialization.Sum;
import Calculator.MVP.View;

import java.io.FileWriter;
import java.io.IOException;

/**
 * В классе реализован запуск выполнения сложения двух чисел.
 */
public class RunSum extends Log implements IRun {
    View view;
    Sum sum;

    public RunSum(View view, Sum sum) {
        this.view = view;
        this.sum = sum;
    }

    @Override
    public void runOperation() {
        double x = view.getValue("Введите x: ");
        double y = view.getValue("Введите y: ");
        double res = sum.result(x, y);
        logInfo(x, y, res);
        view.show(res, "Sum = ");
    }

    @Override
    public void logInfo(double x, double y, double result) {
        {
            try (FileWriter writer = new FileWriter("C:\\Users\\Operator\\IdeaProjects\\java_project\\src\\Calculator\\Logger\\log.txt", true)) {
                String text = String.format("%s + %s = %s\n", x, y, result);
                writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

