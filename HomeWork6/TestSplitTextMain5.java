package HomeWork6;


import HomeWork6.text.EasySearch;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestSplitTextMain5 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        EasySearch easySearch = new EasySearch();
        String word = "Отступления";
        System.out.println("Слово "+ word + " встречается " + easySearch.search(text, word) + " раз");
    }
}




