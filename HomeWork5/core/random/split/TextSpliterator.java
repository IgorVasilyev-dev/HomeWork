package HomeWork5.core.random.split;

import HomeWork5.core.random.Rand;
import HomeWork5.core.random.api.IRandom;
import HomeWork5.core.random.api.IRandomTextSpliterator;

public class TextSpliterator extends Rand implements IRandomTextSpliterator {
    @Override
    public String[] split(String text) {
        String[] arr = text.split("[^а-яА-Я]+");
        return arr;
    }
}
