package HomeWork3.calcs.additional;

public interface ICalculator {

    double multiplication(double x, double y);

    /**
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает результат деления операндов х на у
     */
    double division(double x, double y);

    /**
     * @param x орепанд 1
     * @param y операнд 2
     * @return возвращает результат вычитания между операндоми
     */
    double subtraction(double x, double y);

    /**
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает сумму двух операндов
     */
    double addition(double x, double y);

    /**
     * возведение в степень с помощью библиотеки Math
     *
     * @param value    возводимое число
     * @param powValue степень
     * @return возвращает результат возведения value в стень powValue
     */
    double exp(double value, int powValue);

    /**
     * модуль из числа
     *
     * @param x операнд 1
     * @return возвращает модуль от операнда 1
     */
    double abs(double x);

    /**
     * медот извлечения корня основан на возведении в степень 1/n c помощью библиоетки Math
     *
     * @param value     значение из которого нужно извлечь корень
     * @param sqrtValue извлекаемый корень
     * @return возвращает результат извлечения корня  степени sqrtValue из значения value
     */
    double sqrt(double value, double sqrtValue);

}
