/*
 2.4.2 В массиве найти максимальный элемент с четным индексом. https://taskcode.ru/array/max-even-id
 */
package HomeWork2.arrays;

import java.util.Random;

public class Array242 {
    public static void main(String[] args) {

        int size = 10;
        int maxValueExclusion = 100;
        int max = 0;
        int[] container = arrayRandom(size, maxValueExclusion); // сохраняем созданный массив в переменную container
        System.out.println("Новый массив");
        for (int i = 0; i < container.length; i++) { // вывод значей  массива
            System.out.print (container[i] + " ");
            }
        /* перебираем массив  с шагом 2 */
        for (int i = 2; i < container.length; i += 2) {
            if (container[i] > container[max]) {
                max = i;
                System.out.println("\n" +  max + ":" + container[max]);
            }
        }

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array c  случайными значениями от 0 до maxValueExclusion */
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            array[i] = (rand.nextInt(2 * maxValueExclusion +1)) - maxValueExclusion;
        }
        return  array;

    }
}
