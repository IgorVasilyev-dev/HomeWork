/*
2.1 Написать метод public static int[] arrayFromConsole() рядом с main.
Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 5
  с элементами {4, 17, 32} и сохранён в переменную container.
 */

package HomeWork2.arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] container = arrayFromConsole();
        for (int i = 0; i < container.length; i++) {
            System.out.print (" " + container[i]); // Выводим на экран, полученный массив
        }
        //System.out.println();

    }

    public static int[] arrayFromConsole() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] arr = new int[size]; // Создаём массив int размером в size
        System.out.println("Заполните массив. Если надоело - клацай не цифру");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            String symbol = scanner.next();
            int tmp;
            try {
                tmp = Integer.parseInt(symbol);
            } catch (NumberFormatException e) {
                return arr;
            }
            arr[i] = tmp; // Заполняем массив элементами, введёнными с клавиатуры
        }

        return arr;

    }
}
