package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());

        double division = calculator.div(28, 5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multi(15, 7);

        double add = calculator.add(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
        System.out.println(calculator.getCountOperation());


        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());

        double division1 = calculator1.div(28, 5);

        double exp1 = calculator1.exp(division1, 2);

        double multi1= calculator1.multi(15, 7);

        double add1 = calculator1.add(4.1, multi1);

        double result1 = add1 + exp1;
        System.out.println("result1 = " + result1);
        System.out.println(calculator1.getCountOperation());


        CalculatorWithCounterAutoComposite calculator2 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());

        double division2 = calculator2.div(28, 5);

        double exp2 = calculator2.exp(division2, 2);

        double multi2= calculator2.multi(15, 7);

        double add2 = calculator2.add(4.1, multi2);

        double result2 = add2 + exp2;
        System.out.println("result2 = " + result2);
        System.out.println(calculator2.getCountOperation());

    }
}
