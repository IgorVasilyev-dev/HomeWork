/*
4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
Данный класс ищет слова с учётом регистра.
 */
package HomeWork6;


import HomeWork6.text.RegExSearch;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain6 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\text\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        RegExSearch searchWithRegistry = new RegExSearch();
        String word = "Отступления";
        System.out.println("Слово ("+ word + ") встречается " + searchWithRegistry.search(text, word) + " раз");
    }
}




