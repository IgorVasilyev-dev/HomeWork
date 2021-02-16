package HomeWork6;


import HomeWork6.text.api.EasySearch;
import HomeWork6.text.api.SearchEngineWithRegistry;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain6 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        SearchEngineWithRegistry searchEngineWithRegistry = new SearchEngineWithRegistry();
        String word = "война и мир";
        System.out.println("Слово "+ word + " встречается " + searchEngineWithRegistry.search(text, word) + " раз");
    }
}




