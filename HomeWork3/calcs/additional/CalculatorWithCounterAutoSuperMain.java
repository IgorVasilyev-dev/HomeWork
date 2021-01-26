package HomeWork3.calcs.additional;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double division = calculator.division(28, 5);

        double exp = calculator.exp(division, 2);

        double multi = calculator.multiplication(15, 7);

        double add = calculator.addition(4.1, multi);

        double result = add + exp;
        System.out.println("result = " + result);
        System.out.println(calculator.getCountOperation());
    }

}
