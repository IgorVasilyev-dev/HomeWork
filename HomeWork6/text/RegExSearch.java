package HomeWork6.text;

import HomeWork6.text.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("[^А-Яа-я]" + word + "[^А-Яа-я]");
        Matcher matcher = pattern.matcher(text);
        int result = 0;
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
