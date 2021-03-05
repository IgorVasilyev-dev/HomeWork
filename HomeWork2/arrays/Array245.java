/*
2.4.5 Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
Освободившиеся в конце массива элементы заполнить нулями. https://taskcode.ru/array/zip-zero
 */
package HomeWork2.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array245 {
    public static void main(String[] args) {

        int size = 20;
        int maxValueExclusion = 100;
        int[] container = arrayRandom(size, maxValueExclusion); // сохраняем созданный массив в переменную container
        System.out.println("Новый массив");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nУдаляемый диапозон");
        int l = scanner.nextInt();
        int h = scanner.nextInt();

        int[] arr = arrayDel(container, l, h);
        System.out.println("Сжатый массив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(container[i] + " ");
        }
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array случайными значениями в указанном диапозоне */
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = (rand.nextInt(2 * maxValueExclusion +1)) - maxValueExclusion;
        }
        return  array;

    }
    static int[]  arrayDel(int[] arr, int a, int b) { // метод для удаления заданного диапозона массива
        int N = arr.length;
        for (int i = 0, j = 0; i < N; ) {
            if (j < N) {
                if (!(arr[j] >= a && arr[j] <= b)) {
                    i++;
                }
                arr[i] = ++j < N ? arr[j] : 0;
            } else {
                arr [i++] = 0;
            }
        }
        return arr;
    }

}
