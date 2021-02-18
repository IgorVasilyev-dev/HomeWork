/*
4. Реализовать интерфейс ISearchEngine:
	4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
	В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач. Данный класс ищет слова с учётом регистра.
 */
package HomeWork6;


import HomeWork6.text.EasySearch;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain5 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\text\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        EasySearch easySearch = new EasySearch();
        String word = "Отступления";
        System.out.println("Слово ("+ word + ") встречается " + easySearch.search(text, word) + " раз"); // 1 раз
    }
}




