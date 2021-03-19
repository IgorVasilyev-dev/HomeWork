package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());

        double division = calculator.div(28, 5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multi(15, 7);

        double add = calculator.add(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
        System.out.println(calculator.getCountOperation());
    }
}
