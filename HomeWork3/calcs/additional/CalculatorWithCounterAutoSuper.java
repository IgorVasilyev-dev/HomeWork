package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long using;

    public long getCountOperation() {
        return using;
    }

    @Override
    public double exp(double value, int powValue) {
        using++;
        return super.exp(value, powValue);
    }

    @Override
    public double abs(double x) {
        using++;
        return super.abs(x);
    }

    @Override
    public double sqrt(double value, int sqrtValue) {
        using++;
        return super.sqrt(value, sqrtValue);
    }

    @Override
    public double multiplication(double x, double y) {
        using++;
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        using++;
        return super.division(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        using++;
        return super.subtraction(x, y);
    }

    @Override
    public double addition(double x, double y) {
        using++;
        return super.addition(x, y);
    }
}
