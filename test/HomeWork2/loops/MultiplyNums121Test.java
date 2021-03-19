package test.HomeWork2.loops;

import HomeWork2.loops.MultiplyNums121;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MultiplyNums121Test {
    private final MultiplyNums121 checker = new MultiplyNums121();

    @ParameterizedTest(name = "{index} - Проверяемые вычисления = {0}")
    @DisplayName("Проверка вычисления")
    @MethodSource("valueProvider")
   public void resultToString(String result,String str) {
        Assertions.assertEquals(result, checker.resultToString(str));
    }

    public static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.arguments("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080","181232375"),
                Arguments.arguments("3 * 2 * 5 * 1 * 3 * 5 = 450","325135"),
                Arguments.arguments("2 * 2 * 3 * 4 * 1 * 1 * 4 * 5 = 960","22341145")
        );
    }
}