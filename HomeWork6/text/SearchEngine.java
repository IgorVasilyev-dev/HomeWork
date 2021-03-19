package HomeWork6.text;

import HomeWork6.text.api.ISearchEngine;
import HomeWork6.text.api.ITextSpliterator;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        ITextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);
        Map<String, Integer> data = new HashMap<>();

        for ( String w : strings ) {
            data.merge(w, 1, Integer::sum);
        }
        try {
            return data.get(word);
        } catch (NullPointerException e) {
            return 0;
        }
    }
}
