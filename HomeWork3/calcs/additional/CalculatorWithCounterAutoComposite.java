package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    /**
     * калькулятор класса CalculatorWithOperator
     */
    private CalculatorWithOperator calculatorWithOperator;

    /**
     * калькулятор класса CalculatorWithMathCopy
     */
    private CalculatorWithMathCopy calculatorWithMathCopy;

    /**
     * калькулятор класса CalculatorWithMathExtends
     */
    private CalculatorWithMathExtends calculatorWithMathExtends;

    /**
     * количество использований калькулятора
     */
    private long countOperation;

    /**
     * возвращает счетчик использований калькулятора
     * @return возвращает количество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * конструктор создает объект CalculatorWithCounterAutoComposite
     * @param calculatorWithOperator - объект CalculatorWithOperator
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    /**
     * конструктор создает объект CalculatorWithCounterAutoComposite
     * @param calculatorWithMathCopy - объект CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    /**
     * конструктор создает объект CalculatorWithCounterAutoComposite
     * @param calculatorWithMathExtends - объект CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    /**
     * учитывается количестов использований
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает сумму двух операндов
     */
    public double add(double x, double y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.addition(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.addition(x, y);
        } else
            return calculatorWithMathExtends.addition(x, y);
    }

    /**
     * учитывается количестов использований
     * @param x орепанд 1
     * @param y операнд 2
     * @return возвращает результат вычитания между операндоми
     */
    double minus(double x, double y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(x, y);
        } else
            return calculatorWithMathExtends.subtraction(x, y);
    }

    /**
     * учитывается количестов использований
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает результат деления операндов х на у
     */
    public double div(double x, double y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.division(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(x, y);
        } else
            return calculatorWithMathExtends.division(x, y);
    }

    /**
     * учитывается количестов использований
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает произведение двух операндов
     */
    public double multi(double x, double y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiplication(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiplication(x, y);
        } else
            return calculatorWithMathExtends.multiplication(x, y);
    }

    /**
     * возведение в степень
     * учитывается количестов использований
     * @param x возводимое число
     * @param y степень
     * @return возвращает результат возведения x в стень y
     */
    public double exp(double x, int y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.exp(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.exp(x, y);
        } else
            return calculatorWithMathExtends.exp(x, y);
    }

    /**
     * модуль из числа
     * учитывается количестов использований
     * @param x операнд 1
     * @return возвращает модуль от операнда 1
     */
    public double abs(double x) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.abs(x);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(x);
        } else
            return calculatorWithMathExtends.abs(x);
    }

    /**
     * медот извлечения корня основан на возведении в степень 1/n c помощью библиоетки Math
     * учитывается количестов использований
     * @param x значение из которого нужно извлечь корень
     * @param y извлекаемый корень
     * @return возвращает результат извлечения корня  степени sqrtValue из значения value
     */
    public double sqrt(double x, int y) {
        countOperation++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(x, y);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(x, y);
        } else
            return calculatorWithMathExtends.sqrt(x, y);
    }

}