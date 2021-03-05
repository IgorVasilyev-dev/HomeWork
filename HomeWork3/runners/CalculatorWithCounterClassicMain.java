package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double division = calculator.division(28,5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multiplication(15,7);

        double add = calculator.addition(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
    }
}
