package HomeWork5.utils;

import HomeWork5.utils.api.IRandom;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomRand implements IRandom {

    @Override
    public int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(((max - min) + 1) + min);
    }

    @Override
    public double randDouble(double min, double max) {
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        return rand.nextDouble(min,max);
    }

    @Override
    public String randString(int min, int max) {

            Random rand = new Random();
            int length = rand.nextInt(((max - min) + 1) + min);
            String symbols = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(symbols.charAt(rand.nextInt(symbols.length() - 1)));
            }
            return sb.toString();
        }



        @Override
        public boolean randBoolean () {
            ThreadLocalRandom rand  = ThreadLocalRandom.current();
            return rand.nextBoolean();
        }
    }

