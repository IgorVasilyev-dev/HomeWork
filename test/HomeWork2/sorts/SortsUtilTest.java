package test.HomeWork2.sorts;

import HomeWork2.sorts.SortsUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class SortsUtilTest {

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Проверка пузырьковой сортировки")
    @MethodSource("arrayValuesProvider")
    public void bubbleSort(String arrays, int[] container) {
        SortsUtil.bubbleSort(container);
        Assertions.assertEquals(arrays, Arrays.toString(container));
    }

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Проверка шейкерной сортировки")
    @MethodSource("arrayValuesProvider")
    public void shakerSort(String arrays, int[] container) {
        SortsUtil.shakerSort(container);
        Assertions.assertEquals(arrays, Arrays.toString(container));
    }

    private static Stream<Arguments> arrayValuesProvider() {
        return Stream.of(
                Arguments.arguments("[1, 1, 4, 6, 15, 235, 332]", new int[]{1,235,332,4,15,1,6}),
                Arguments.arguments("[1, 2, 5, 6, 22]", new int[]{1,5,6,22,2}),
                Arguments.arguments("[1, 2, 3, 4, 5, 6, 7]", new int[]{1,2,3,4,5,6,7}),
                Arguments.arguments("[0, 1, 2]", new int[]{0,1,2})
        );
    }

}