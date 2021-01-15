/*
Найти сумму четных положительных элементов массива https://taskcode.ru/array/sum-even-pos
 */
package HomeWork2.arrays;

import java.util.Random;

public class Array241 {
    public static void main(String[] args) {

        int s = 0;
        int size = 20;
        int maxValueExclusion = 100;
        int[] container = arrayRandom(size, maxValueExclusion); // сохраняем созданный массив в переменную container
        System.out.println("Новый массив");
        /* перебираем массив */
        for (int i = 0; i < container.length; i++) {
            System.out.print (container[i] + " ");
            if (container[i] > 0 && container[i] % 2 == 0) {
                s += container[i];
            }
        }
        System.out.println("\nСумма натуральных чисел массива = " + s);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array случайными значениями в указанном диапозоне */
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            array[i] = (rand.nextInt(2 * maxValueExclusion +1)) - maxValueExclusion;
        }
        return  array;

    }
}
