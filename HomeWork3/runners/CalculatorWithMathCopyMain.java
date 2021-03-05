package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double division = calculator.division(28,5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multiplication(15,7);

        double add = calculator.addition(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
    }

}
