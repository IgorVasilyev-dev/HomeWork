package HomeWork6.text;

import HomeWork6.text.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int count = 0, fromIndex = 0;

        while ((fromIndex = text.indexOf(word, fromIndex)) != -1 ){

            count++;
            fromIndex++;

        }

        return count;
    }
}
