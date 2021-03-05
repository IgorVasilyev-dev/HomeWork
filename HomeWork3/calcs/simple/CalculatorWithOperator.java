package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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

    public double exp(double value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * exp(value, powValue - 1);
        }
    }

    public double abs(double x) {
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    }

    @Override
    public double sqrt(double value, double sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }

    public double sqrt( double value, int sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }

}
