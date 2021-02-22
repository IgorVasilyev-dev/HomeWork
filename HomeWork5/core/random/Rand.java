/*
2.1 Заполнять имя рандомными русскими символами
 */
package HomeWork5.core.random;

import HomeWork5.core.random.api.IRandom;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Rand implements IRandom {
    @Override
    public int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public double randDouble(double min, double max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextDouble(min,max);
    }

    /**
     * Метод генерирует строку из случайных русских сиволов, длинна генерируется случайно в диапозоне [min max]
     * @param min минимальное количество символов
     * @param max максимальное количество символов
     * @return возвращает строку заполненую случайными русскими буквами, длинна строки  в интервале от min до max
     */
    @Override
    public String randString(int min, int max) {
        Random rand = new Random();
        int length = rand.nextInt(max - min + 1) + min;
        String symbols = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(symbols.charAt(rand.nextInt(symbols.length())));
        }
        return sb.toString();
    }

    @Override
    public boolean randBoolean() {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextBoolean();
    }
}
