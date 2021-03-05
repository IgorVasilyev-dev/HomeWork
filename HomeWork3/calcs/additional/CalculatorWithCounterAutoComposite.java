package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

     private CalculatorWithOperator calculatorWithOperator;
     private CalculatorWithMathCopy calculatorWithMathCopy;
     private CalculatorWithMathExtends calculatorWithMathExtends;

     long countOperation;

    public long getCountOperation() {
        return countOperation;
    }
    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }
    public double add(double x, double y) {
        countOperation++;
        return calculatorWithOperator.addition(x,y);
    }
    double minus(double x, double y) {
        countOperation++;
        return calculatorWithOperator.subtraction(x,y);
    }
    public double div(double x, double y) {
        countOperation++;
        return calculatorWithMathCopy.division(x,y);
    }
    public double multi(double x, double y) {
        countOperation++;
        return calculatorWithMathCopy.multiplication(x,y);
    }
    public double exp(double x, int y) {
        countOperation++;
        return calculatorWithMathExtends.exp(x,y);
    }
    double abs(double x) {
        countOperation++;
        return calculatorWithMathExtends.abs(x);
    }
    double sqrt(double x, int y) {
        countOperation++;
        return calculatorWithMathExtends.sqrt(x,y);
    }
}
