/*
2.4.4 Найти два наименьших (минимальных) элемента массива https://taskcode.ru/array/two-min
 */
package HomeWork2.arrays;

import java.util.Random;

public class Array244 {

    public static void main(String[] args) {

        int min1;
        int min2;
        int b;
        int size = 10;
        int maxValueExclusion = 100;
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println("Новый массив");
        for (int i = 0; i < container.length; i++) { // вывод значей  массива
            System.out.print(container[i] + " ");
        }

        if (container[0] > container[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < container.length; i++) {
            if (container[i] < container[min1]) {
                b = min1;
                min1 = i;
                if (container[b] < container[min2]) {
                    min2 = b;
                } else {
                    if (container[i] < container[min2]) {
                        min2 = i;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(min1 + ":" + container[min1]);
        System.out.println(min2 + ":" + container[min2]);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array случайными значениями в указанном диапозоне */
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = (rand.nextInt(maxValueExclusion) + 1);
        }
        return  array;
    }
}
