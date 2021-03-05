/*
2.4.6 Сумма цифр массива https://taskcode.ru/array/sum-digits
 */
package HomeWork2.arrays;

import java.util.Random;

public class Array246 {

    public static void main(String[] args) {

        int size = 5;
        int maxValueExclusion = 10;
        int sum = 0;
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println("Новый массив");
        for (int item : container) { // вывод значей  массива
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : container) { // вывод значей  массива

            int value = item;

            while (value > 0) {
                int l = value % 10;
                value /= 10;
                sum = sum + l;
            }

        }

        System.out.println("Сумма цифр массива = " + sum);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array случайными значениями в указанном диапозоне */
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = (rand.nextInt(maxValueExclusion) + 1);
        }
        return array;
    }
}
