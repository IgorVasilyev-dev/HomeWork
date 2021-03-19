package test.HomeWork6.text.api;

import HomeWork6.text.EasySearch;
import HomeWork6.text.RegExSearch;
import HomeWork6.text.SearchEngine;
import HomeWork6.text.SearchEngineIgnoreRegistry;
import HomeWork6.text.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ISearchEngineTest {

    @ParameterizedTest(name = "Поиск - {index}")
    @DisplayName("Проверка поиска слов")
    @MethodSource("ValuesProvider")
    public void searchWord(String text, long n, String word, ISearchEngine searchEngine) {
        Assertions.assertEquals(n, searchEngine.search(text,word));
    }

    private static Stream<Arguments> ValuesProvider() {
        return Stream.of(
                Arguments.arguments("Мама мыла раму", 0, "мыл", new SearchEngine()),
                Arguments.arguments("DFDF dfdf DfDf fDfD", 3, "dfdf", new SearchEngineIgnoreRegistry()),
                Arguments.arguments("ЯМАС vgreмСА сам08 САм сАм ", 1, "сАм", new EasySearch()),
                Arguments.arguments("ЯМАС vgreмСА сам08 САм+Сам ", 0, "Cам", new RegExSearch()),
                Arguments.arguments("ЯМАС vgreмСА сам08 САм ", 0, "Cам", new SearchEngineIgnoreRegistry())
        );
    }
}