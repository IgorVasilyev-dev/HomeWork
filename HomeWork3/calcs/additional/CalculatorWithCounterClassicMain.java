package HomeWork3.calcs.additional;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double division = calculator.division(28,5);
        calculator.incrementCountOperation();
        double exp = calculator.exp(division, 2);
        calculator.incrementCountOperation();
        double multi = calculator.multiplication(15,7);
        calculator.incrementCountOperation();
        double add = calculator.addition(4.1, multi);
        calculator.incrementCountOperation();
        double result = add + exp;
        System.out.println("result = " + result);
        System.out.println(calculator.getCountOperation());
    }
}
