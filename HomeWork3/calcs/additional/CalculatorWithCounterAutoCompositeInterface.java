package HomeWork3.calcs.additional;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator {

    /**
     * количество использований калькулятора
     */
    private long countOperation;

    /**
     * реализуем интерфейс ICalculator
     */
    private final ICalculator calculator;

    /**
     * Конструктор создает объект CalculatorWithCounterAutoCompositeInterface
     * @param calculator - объект который реализует интерфейс ICalculator
     */
    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     *  возвращает количестов использований калькулятора
     * @return текущее количество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает произведение двух операндов
     */
    @Override
    public double multiplication(double x, double y) {
        countOperation++;
        return this.calculator.multiplication(x, y);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает результат деления операндов х на у
     */
    @Override
    public double division(double x, double y) {
        countOperation++;
        return this.calculator.division(x, y);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * @param x орепанд 1
     * @param y операнд 2
     * @return возвращает результат вычитания между операндоми
     */
    @Override
    public double subtraction(double x, double y) {
        countOperation++;
        return this.calculator.subtraction(x, y);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * @param x операнд 1
     * @param y операнд 2
     * @return возвращает сумму двух операндов
     */
    @Override
    public double addition(double x, double y) {
        countOperation++;
        return this.calculator.addition(x, y);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * возведение в степень
     * @param value возводимое число
     * @param powValue степень
     * @return возвращает результат возведения value в стень powValue
     */
    @Override
    public double exp(double value, int powValue) {
        countOperation++;
        return this.calculator.multiplication(value, powValue);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * модуль из числа
     * @param x операнд 1
     * @return возвращает модуль от операнда 1
     */
    @Override
    public double abs(double x) {
        countOperation++;
        return this.calculator.abs(x);
    }

    /**
     * метод делигирует  действие вспомогательного класса
     * учитывается количество использований калькулятора
     * медот извлечения корня основан на возведении в степень 1/n c помощью библиоетки Math
     * @param value значение из которого нужно извлечь корень
     * @param sqrtValue извлекаемый корень
     * @return возвращает результат извлечения корня  степени sqrtValue из значения value
     */
    @Override
    public double sqrt(double value, double sqrtValue) {
        countOperation++;
        return this.calculator.multiplication(value, sqrtValue);
    }
}
