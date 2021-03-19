package test.additional.api;

import HomeWork3.calcs.additional.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ICalculatorTest {

    public final ICalculator calculator = new CalculatorWithOperator();

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Проверка вычислений")
    @MethodSource("additionValuesProvider")
    public void addition(double x, double y) {
        Assertions.assertEquals(x + y,calculator.addition(x,y));
    }

    private static Stream<Arguments> ValuesProvider1() {
        return Stream.of(
                Arguments.arguments(23, 22),
                Arguments.arguments(1, 1),
                Arguments.arguments(10000000.0, 9999999,1),
                Arguments.arguments(-234235, -234235,1)
        );
    }

    private static Stream<Arguments> ValuesProvider2() {
        return Stream.of(
                Arguments.arguments(23, 2),
                Arguments.arguments(1, 3),
                Arguments.arguments(3, 1),
                Arguments.arguments(-234235, 5)
        );
    }

}