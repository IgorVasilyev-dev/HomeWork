package HomeWork3.calcs.additional;

import HomeWork3.calcs.additional.api.ICalculator;

public class CalculatorWithCounterAutoInterface implements ICalculator {

    private long counter;
    private ICalculator calculator;

    public CalculatorWithCounterAutoInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double multiplication(double x, double y) {
        counter++;
        return this.calculator.multiplication(x,y);
    }

    @Override
    public double division(double x, double y) {
        counter++;
        return this.calculator.division(x,y);
    }

    @Override
    public double subtraction(double x, double y) {
        counter++;
        return this.calculator.subtraction(x,y);
    }

    @Override
    public double addition(double x, double y) {
        counter++;
        return this.calculator.addition(x,y);
    }

    @Override
    public double exp(double value, int powValue) {
        counter++;
        return this.calculator.exp(value,powValue);
    }

    @Override
    public double abs(double x) {
        counter++;
        return this.calculator.abs(x);
    }

    @Override
    public double sqrt(double value, double sqrtValue) {
        counter++;
        return this.calculator.sqrt(value,sqrtValue);
    }

    public long getCountOperation() {
        return counter;
    }
}
