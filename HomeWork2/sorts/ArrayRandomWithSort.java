/*
4.4. После тестов написать код который будет создавать массив через ранее созданный arrayRandom. Отсортировать.
4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.
 */

package HomeWork2.sorts;


import HomeWork2.arrays.Array;
import HomeWork2.arrays.ArrayRandom23;

import java.util.Arrays;

public class ArrayRandomWithSort {
    public static void main(String[] args) {
        int[] arr1 = Array.arrayFromConsole();
        SortsUtil.bubbleSort(arr1);
        System.out.println("Массив 1");
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = ArrayRandom23.arrayRandom(5, 100);
        SortsUtil.shakerSort(arr2);
        System.out.println("Массив 2");
        System.out.println(Arrays.toString(arr2));
    }
}