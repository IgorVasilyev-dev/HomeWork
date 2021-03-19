package test.HomeWork2.sorts;

import HomeWork2.sorts.SortUtilsWithComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class SortUtilsWithComparatorTest {

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Проверка пузырьковой сортировки")
    @MethodSource("arrayValuesProvider")
   public void bubbleSort(String arrays, List<Integer> container, Comparator<Integer> comparator) {
        SortUtilsWithComparator.bubbleSort(container, comparator);
        Assertions.assertEquals(arrays,container.toString());
    }

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Проверка шейкерной сортировки")
    @MethodSource("arrayValuesProvider")
    public void shakerSort(String arrays, List<Integer> container, Comparator<Integer> comparator) {
        SortUtilsWithComparator.shakerSort(container, comparator);
        Assertions.assertEquals(arrays,container.toString());
    }

    private static Stream<Arguments> arrayValuesProvider() {
        return Stream.of(
                Arguments.arguments("[1, 1, 4, 6, 15, 235, 332]", Arrays.asList(1,235,332,4,15,1,6), Comparator.nullsLast(Comparator.naturalOrder())),
                Arguments.arguments("[Z, B, A, 5, 1]", Arrays.asList("1","5","Z","A","B"), Comparator.reverseOrder()),
                Arguments.arguments("[1, 4, 6, 15, 235, 332, null]", Arrays.asList(null,235,332,4,15,1,6), Comparator.nullsLast(Comparator.naturalOrder())),
                Arguments.arguments("[sdf, f, 34, 0, null]", Arrays.asList("sdf", "34", null, "f", "0"), Comparator.nullsLast(Comparator.reverseOrder())),
                Arguments.arguments("[7, 6, 5, 4, 3, 2, 1]", Arrays.asList(1,2,3,4,5,6,7), Comparator.reverseOrder()),
                Arguments.arguments("[0, 0, 0]", Arrays.asList(0,0,0), Comparator.nullsLast(Comparator.naturalOrder()))
        );
    }
}