/*
2.4.3 Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого от всех элементов массива.
https://taskcode.ru/array/avrg-less
 */
package HomeWork2.arrays;

import java.util.Random;

public class Array243 {

    public static void main(String[] args) {
        int sum = 0;
        int size = 10;
        int maxValueExclusion = 100;
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println("Новый массив");
        for (int i = 0; i < container.length; i++) { // вывод значей  массива
            System.out.print (container[i] + " ");
            sum += container[i];
        }
        double avrg = sum / size ;
        System.out.println("\nСреднее арифметическое = " + avrg);
        for(int i = 0; i < container.length; i++) {
            if (container[i] < avrg) {
                System.out.print(container[i] + " ");
            }
        }

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
