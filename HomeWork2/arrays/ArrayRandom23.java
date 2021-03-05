/*
2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив размером 5
    с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

package HomeWork2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        System.out.println("Введите maxValueExclusion");
        int maxValueExclusion = scanner.nextInt();

        int[] container = arrayRandom(size, maxValueExclusion); // сохраняем созданный массив в переменную container

        System.out.println("Новый массив");
        for (int value : container) {
            System.out.print(value + " ");
        }

    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] array = new int[size]; //создаем массив array c длинной size
        /* заполняем массив int[size] array c  случайными значениями от 0 до maxValueExclusion */
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
           array[i] = rand.nextInt(maxValueExclusion);
        }
        return  array;

    }
}
