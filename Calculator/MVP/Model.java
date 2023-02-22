package Calculator.MVP;

import Calculator.Choice;
import Calculator.OperationsInitialization.Div;
import Calculator.OperationsInitialization.Mult;
import Calculator.OperationsInitialization.Sum;
import Calculator.OperationsRun.RunDiv;
import Calculator.OperationsRun.RunMult;
import Calculator.OperationsRun.RunSum;

/**В классе производится основное действие калькулятора, выбирается пункт меню и далее от выбранной цифры воспроизводится нужная операция.*/
public class Model {
    Choice choice = new Choice();
    public void run() {
        int getChoice = choice.getChoice();
        RunSum runSum = new RunSum(new View(), new Sum());
        RunMult runMult = new RunMult(new View(), new Mult());
        RunDiv runDiv = new RunDiv(new View(), new Div());
        switch (getChoice) {
            case 1 -> runSum.runOperation();
            case 2 -> runMult.runOperation();
            case 3 -> runDiv.runOperation();
        }
    }
}
