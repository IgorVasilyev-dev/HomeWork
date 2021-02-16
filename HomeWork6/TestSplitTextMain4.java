package HomeWork6;


import HomeWork6.text.api.ITextSpliterator;
import HomeWork6.text.api.SearchEngine;
import HomeWork6.text.api.TextSpliterator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain4 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        SearchEngine searchEngine = new SearchEngine();
        String word = "отступления";
        System.out.println("Слово "+ word + " встречается " + searchEngine.search(text, word) + " раз");
    }
}




