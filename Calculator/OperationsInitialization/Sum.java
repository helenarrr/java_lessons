package Calculator.OperationsInitialization;

import Calculator.IResult;

/**В классе находится метод, в котором происходит сложение двух чисел.*/
public class Sum implements IResult {

    @Override
    public double result(double x, double y) {
        return x + y;
    }
}
