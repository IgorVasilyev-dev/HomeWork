package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     *
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает сумму двух операндов
     */
    public double addition(double x, double y) {
        return x + y;
    }

    /**
     *
     * @param x орепанд 1
     * @param y операнд 2
     * @return возвращает результат вычитания между операндоми
     */
    public double subtraction(double x, double y) {
        return x - y;
    }

    /**
     *
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает результат деления операндов х на у
     */
    public double division(double x, double y) {
        if ( y == 0) {
            return  0;
        }
        return x / y;
    }

    /**
     *
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает произведение двух операндов
     */
    public double multiplication(double x, double y) {
        return x * y;
    }

    /**
     *
     * @param x операнд 1
     * @return возвращает модуль от операнда 1
     */
    public double abs(double x) {
        if ( x < 0) {
            return x * -1;
        }
        return x;
    }

    @Override
    public double sqrt(double value, double sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }

    /**
     *
     * @param value возводимое число
     * @param powValue степень
     * @return возвращает результат возведения value в стень powValue
     */
    public double exp(double value, int powValue) {
        if (powValue == 1) {
            return value;
        }
        return value  *  exp(value, powValue -1);
    }

    /**
     *
     * @param value значение из которого нужно извлечь корень
     * @param sqrtValue извлекаемый корень
     * @return возвращает результат извлечения корня  степени sqrtValue из значения value
     */
    public double sqrt(double value, int sqrtValue) {
        return Math.pow(value, 1.0 / sqrtValue);
    }

}
