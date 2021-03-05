package test.HomeWork2.arrays;

import HomeWork2.arrays.ArraysOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArraysOperationTest {
    public ArraysOperation array = new ArraysOperation();

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Перебор массива")
    @MethodSource("arrayValuesProvider")
    public void methodDoWhile(String arrays, int[] arr)  {
        Assertions.assertEquals(arrays, array.methodDoWhile(arr));
    }

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Перебор массива")
    @MethodSource("arrayValuesProvider")
    public void methodWhile(String arrays, int[] arr)  {
        Assertions.assertEquals(arrays, array.methodDoWhile(arr));
    }

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Перебор массива")
    @MethodSource("arrayValuesProvider")
    public void methodFor(String arrays, int[] arr)  {
        Assertions.assertEquals(arrays, array.methodDoWhile(arr));
    }

    @ParameterizedTest(name = "{index} - Новый массив = {0}")
    @DisplayName("Перебор массива")
    @MethodSource("arrayValuesProvider")
    public void methodForEach(String arrays, int[] arr)  {
        Assertions.assertEquals(arrays, array.methodDoWhile(arr));
    }

    public static Stream<Arguments> arrayValuesProvider() {
        return Stream.of(
                Arguments.arguments("{1,12,2}",new int[]{1, 12, 2}),
                Arguments.arguments("{5,16,53,21,2312,414,523,-2}",new int[]{5,16,53,21,2312,414,523,-2}),
                Arguments.arguments("{-123,1241,145565,214,-2,1}",new int[]{-123,1241,145565,214,-2,1}),
                Arguments.arguments("{0,1,0,2,0,3,0,-1}",new int[]{0,1,0,2,0,3,0,-1}),
                Arguments.arguments("{1,1,1,1,1,1,1,1}",new int[]{1,1,1,1,1,1,1,1}),
                Arguments.arguments("{0,0,0}",new int[]{0,0,0})
        );
    }
}