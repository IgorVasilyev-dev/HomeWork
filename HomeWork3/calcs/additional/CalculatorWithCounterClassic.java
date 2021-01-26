package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long using;

    public void incrementCountOperation() {
        using++;
    }
    public long getCountOperation() {
        return using;
    }
}
