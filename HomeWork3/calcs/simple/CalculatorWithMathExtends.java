package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.ICalculator;

public class CalculatorWithMathExtends  extends CalculatorWithOperator implements ICalculator {
    /**
     * возведение в степень с помощью библиотеки Math
     * @param value возводимое число
     * @param powValue степень
     * @return возвращает результат возведения value в стень powValue
     */
    @Override
    public double exp(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    /**
     * модуль из числа с помощью библиотеки Math
     * @param x операнд 1
     * @return возвращаем модуль числа х
     */
    @Override
    public double abs(double x) {
        return Math.abs(x);
    }

    /**
     *
     * @param value значение из которого нужно извлечь корень
     * @param sqrtValue извлекаемый корень
     * @return возвращает результат извлечения корня  степени sqrtValue из значения value
     */
    @Override
    public double sqrt(double value, int sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }
}
