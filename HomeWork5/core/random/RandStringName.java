package HomeWork5.core.random;

import HomeWork5.core.random.api.IRandom;

import java.util.concurrent.ThreadLocalRandom;

public class RandStringName extends Rand implements IRandom {

    private final ThreadLocalRandom rand  = ThreadLocalRandom.current();
    private final String[] text;

    /**
     * Конструктор создает объект RandStringName
     * @param text объект RandStringName
     */
    public RandStringName(String[] text) {
        this.text = text;
    }

    /**
     * Метод возвращает строку длинной в диапозоне [min max]
     * @param min минимальное количество символовом
     * @param max максимальное количество символов
     * @return возвращает строку из text, если flag(min, max) = true; Иначе возвращает строку "NoName"
     */
    @Override
    public String randString(int min, int max) {
        int index;
            while (flag(min, max)) {
                index = rand.nextInt((text.length));
                if (text[index].length() >= min && text[index].length() <= max) {
                    return text[index];
                }
        }
        return "NoName";
    }

    /**
     * Метод проверяет text на наличие хотя бы 1го элемента с длинной строки от min до max
     * @param min параметр минимальной длинны строки
     * @param max параметр максимальной длинны строки
     * @return возвращает true в случае, если в text есть элемент с длинной строки от min до max
     */
    private   boolean flag(int min, int max) {
        for (String s: text) {
            if (s.length() <= max && s.length() >= min) {
                return true;
            }
        }
        return false;
    }

}
