package HomeWork6;


import HomeWork6.comparators.ValueString;
import HomeWork6.text.api.ITextSpliterator;
import HomeWork6.text.TextSpliterator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TestSplitTextMain3 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork6\\Война и мир_книга.txt"),
                StandardCharsets.UTF_8
        );

        ITextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);
        System.out.println("Количество слов в тексте = " + strings.length);
        Map<String, Integer> data = new HashMap<>();

        for ( String word : strings ) {

            if ( data.get(word) == null ) {
                data.put(word, 1);
            }
            else {
                data.put(word, data.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(data.entrySet());
        entries.sort(new ValueString());

        int n = 10;
        for(int i = 0; i< n; i++) {
            System.out.println(entries.get(i));
        }


        System.out.println(data.get("отступления")); // 14 c учетом регистра
        System.out.println(data.get("мир")); // 33 с учетом регистра
    }
}




