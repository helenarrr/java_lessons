package Calculator.OperationsInitialization;

import Calculator.IResult;

public class Div implements IResult {
    @Override
    public double result(double x, double y) {
        return x / y;
    }
}
