package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.api.ICalculator;

public class CalculatorWithMathExtends  extends CalculatorWithOperator  implements ICalculator {
    @Override
    public double exp(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double abs(double x) {
        return Math.abs(x);
    }

    @Override
    public double sqrt(double value, int sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }
}
