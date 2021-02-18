/*
3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
	3.1 long search(String text, String word) - Метод возвращает информации о количестве раз которое встречается слово в тексте.
	Первый параметр текст в котором ищем, второй параметр что ищем в тексте.
 */
package HomeWork6;


import HomeWork6.text.SearchEngine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain4 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\text\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        SearchEngine searchEngine = new SearchEngine();
        String word = "отступления";
        System.out.println("Слово ("+ word + ") встречается " + searchEngine.search(text, word) + " раз"); // 14 раз
    }
}




