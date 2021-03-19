package test.HomeWork3.calcs.additional.api;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoInterface;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;
import HomeWork3.calcs.additional.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ICalculatorTest {

    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка сложения")
    @MethodSource("ValuesProvider1")
    public void addition(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(x + y,calculator.addition(x,y));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка вычитания")
    @MethodSource("ValuesProvider1")
    public void subtraction(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(x - y,calculator.subtraction(x,y));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка деления")
    @MethodSource("ValuesProvider1")
    public void division(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(x / y,calculator.division(x,y));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка умножения")
    @MethodSource("ValuesProvider1")
    public void multiplication(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(x * y,calculator.multiplication(x,y));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка возведения в степень")
    @MethodSource("ValuesProvider2")
    public void exp(double x, int y, ICalculator calculator) {
        Assertions.assertEquals(Math.pow(x, y),calculator.exp(x,y));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка модуль из числа")
    @MethodSource("ValuesProvider1")
    public void abs(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(Math.abs(x),calculator.abs(x));
    }
    @ParameterizedTest(name = "Калькулятор - {index}")
    @DisplayName("Проверка корень из числа")
    @MethodSource("ValuesProvider2")
    public void sqrt(double x, double y, ICalculator calculator) {
        Assertions.assertEquals(Math.sqrt(y),calculator.sqrt(y,2));
    }

    private static Stream<Arguments> ValuesProvider1() {
        return Stream.of(
                Arguments.arguments(23, 22.2, new CalculatorWithOperator()),
                Arguments.arguments(0, 1, new CalculatorWithMathCopy()),
                Arguments.arguments(10000000.0, 9999999, new CalculatorWithMathExtends()),
                Arguments.arguments(-21.2, 124.1, new CalculatorWithCounterAutoInterface(new CalculatorWithMathCopy())),
                Arguments.arguments(345, 1, new CalculatorWithCounterAutoSuper()),
                Arguments.arguments(-234235, -234235, new CalculatorWithCounterClassic())
        );
    }

    private static Stream<Arguments> ValuesProvider2() {
        return Stream.of(
                Arguments.arguments(1, 2, new CalculatorWithOperator()),
                Arguments.arguments(0, 1, new CalculatorWithMathCopy()),
                Arguments.arguments(10, 3, new CalculatorWithMathExtends()),
                Arguments.arguments(-21, 3, new CalculatorWithCounterAutoInterface(new CalculatorWithMathCopy())),
                Arguments.arguments(345, 1, new CalculatorWithCounterAutoSuper()),
                Arguments.arguments(-1.2, 8, new CalculatorWithCounterClassic())
        );
    }
}