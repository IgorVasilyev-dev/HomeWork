package HomeWork6.text.api;

import java.util.regex.Pattern;

public class TextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        String[] arr = text.split("[^\\dА-Я-а-я]+");
        //String[] arr = text.split("[^\\dА-Я-а-я]+");
        return arr;
    }
}
