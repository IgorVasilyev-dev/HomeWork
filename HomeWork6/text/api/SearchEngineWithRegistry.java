package HomeWork6.text.api;

import java.util.HashMap;
import java.util.Map;

public class SearchEngineWithRegistry implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        int count = 0, fromIndex = 0;

        while ((fromIndex = text.toLowerCase().indexOf(word, fromIndex)) != -1 ){

            count++;
            fromIndex++;

        }
        return count;
    }
}
