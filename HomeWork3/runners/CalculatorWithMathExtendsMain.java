package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double division = calculator.division(28,5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multiplication(15,7);

        double add = calculator.addition(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
    }
}
