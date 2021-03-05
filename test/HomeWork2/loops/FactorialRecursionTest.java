package test.HomeWork2.loops;

import HomeWork2.loops.FactorialRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FactorialRecursionTest {
    private final FactorialRecursion checker = new FactorialRecursion();

    @ParameterizedTest(name = "{index} - Проверяемые вычисления = {0}")
    @DisplayName("Проверка вычисления")
    @MethodSource("valueProvider")
    public void calcFact(int n, long value) {
        Assertions.assertEquals(value, checker.calcFact(n));
    }

    @ParameterizedTest(name = "{index} - Проверяемые вычисления = {0}")
    @DisplayName("Проверка вычисления")
    @MethodSource("valueProvider1")
    public void testToString(int n, String result) {
            Assertions.assertEquals(result, checker.toString(n));
    }

    public static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.arguments(5,120),
                Arguments.arguments(2,2),
                Arguments.arguments(10,3628800),
                Arguments.arguments(-5,-1),
                Arguments.arguments(21,-1)
        );
    }
    public static Stream<Arguments> valueProvider1() {
        return Stream.of(
                Arguments.arguments(5,"1 * 2 * 3 * 4 * 5 = 120"),
                Arguments.arguments(2,"1 * 2 = 2"),
                Arguments.arguments(10,"1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800"),
                Arguments.arguments(-5,"принято недопустимое значение"),
                Arguments.arguments(24,"1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 * 21 = переполнение")
        );
    }

}