package HomeWork6.text;

import HomeWork6.text.api.ISearchEngine;


public class SearchEngineIgnoreRegistry implements ISearchEngine {


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
