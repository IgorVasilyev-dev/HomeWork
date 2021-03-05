package test.HomeWork1;

import HomeWork1.DZ1_5_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DZ1_5_3Test {
    private final DZ1_5_3 checker = new DZ1_5_3();

    @ParameterizedTest(name = "{index} - Проверяемый текст = {0}")
    @DisplayName("Проверка результатов")
    @MethodSource("nameProvider")
    public void welcome(String name, String text) {
        Assertions.assertEquals(text, checker.welcome(name));
    }
    public static Stream<Arguments> nameProvider(){
        return Stream.of(
                Arguments.arguments("Ivan","Добрый день, а вы кто?"),
                Arguments.arguments("Вася", "Привет!\n"+"Я тебя так долго ждал"),
                Arguments.arguments("Анастасия", "Я тебя так долго ждал"),
                Arguments.arguments("KLJ)(*3rgv", "Добрый день, а вы кто?")
        );
    }
}