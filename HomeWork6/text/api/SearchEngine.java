package HomeWork6.text.api;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        ITextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);
        Map<String, Integer> data = new HashMap<>();

        for ( String w : strings ) {

            if (data.get(w) == null ) {
                data.put(w, 1);
            }
            else {
                data.put(w, data.get(w) + 1);
            }
        }
        return data.get(word);
    }
}
