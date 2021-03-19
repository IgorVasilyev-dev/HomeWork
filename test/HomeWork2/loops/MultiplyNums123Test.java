package test.HomeWork2.loops;

import HomeWork2.loops.MultiplyNums123;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class MultiplyNums123Test {
    private final MultiplyNums123 checker = new MultiplyNums123();

    @ParameterizedTest(name = "{index} - Проверяемые вычисления = {0}")
    @DisplayName("Проверка вычисления")
    @MethodSource("valueProvider")
    void resultToString(String result, String number) {
        Assertions.assertEquals(result, checker.resultToString(number));
    }

    public static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.arguments("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", "181232375"),
                Arguments.arguments("Введено не целое число", "99.2"),
                Arguments.arguments("2 * 2 * 3 * 4 * 1 * 1 * 4 * 5 = 960", "22341145"),
                Arguments.arguments("Введено не целое число", "4236,3"),
                Arguments.arguments("Введено не число", "Привет12.34"),
                Arguments.arguments("Введено не число", "ТЕСТ253,5u"),
                Arguments.arguments("Введено не число", "@$.$%"),
                Arguments.arguments("Введено не число", "123Я456_C4356"),
                Arguments.arguments("0 * 0 * 0 = 0", "000"),
                Arguments.arguments("1 * 0 * 0 * 5 * 0 * 0 = 0", "100500")
        );
    }
}