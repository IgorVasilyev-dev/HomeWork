package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.api.ICalculator;

public class CalculatorWithMathCopy  implements ICalculator {

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double addition(double x, double y) {
        return x + y;
    }

    public double exp( double value, int powValue) {
        return Math.pow(value, powValue);
    }

    public double abs(double x) {
        return Math.abs(x);
    }

    public double sqrt( double value, double sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }
}
