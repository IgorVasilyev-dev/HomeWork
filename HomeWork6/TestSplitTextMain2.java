/*
2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
 */
package HomeWork6;


import HomeWork6.text.api.ITextSpliterator;
import HomeWork6.text.TextSpliterator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class TestSplitTextMain2 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\text\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        ITextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);
        System.out.println("Количество слов в тексте = " + strings.length);
        Set<String> uniqueString = new HashSet<>();

        for (String string : strings) {
            uniqueString.add(string);
        }

        System.out.println("Количество использованных слов = " + uniqueString.size());
    }
}




