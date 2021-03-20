package HomeWork6.text;

import HomeWork6.text.api.ITextSpliterator;

import java.util.regex.Pattern;

public class TextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        return text.split("[^\\dА-Я-а-я]+");
    }
}
