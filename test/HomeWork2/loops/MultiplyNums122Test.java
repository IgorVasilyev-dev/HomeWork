package test.HomeWork2.loops;


import HomeWork2.loops.MultiplyNums122;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MultiplyNums122Test {
    private final MultiplyNums122 checker = new MultiplyNums122();

    @ParameterizedTest(name = "{index} - Проверяемые вычисления = {0}")
    @DisplayName("Проверка вычисления")
    @MethodSource("valueProvider")
    void resultToString(String result, String number) {
        Assertions.assertEquals(result, checker.resultToString(number));
    }

    public static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.arguments("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080","181232375"),
                Arguments.arguments("Введено не целое число","99.2"),
                Arguments.arguments("2 * 2 * 3 * 4 * 1 * 1 * 4 * 5 = 960","22341145"),
                Arguments.arguments("Введено не целое число","4236,3")
        );
    }
}