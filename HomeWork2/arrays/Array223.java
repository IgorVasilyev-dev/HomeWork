/*
2.1 Написать метод public static int[] arrayFromConsole() рядом с main.
Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 5
  с элементами {4, 17, 32} и сохранён в переменную container.
  2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя метод arrayFromConsole().
   Все задачи в одном классе, в отдельных методах.
		2.2.3 Вывести все элементы массива в консоль в обратном порядке.
 */

package HomeWork2.arrays;


import java.util.Scanner;

public class Array223 {

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println("\nВыводим масси в с помощью Do while");
        methodDoWhile(container);
        System.out.println("\nВыводим массив с помощью while");
        methodWhile(container);
        System.out.println("\nВыводим массив с помощью for");
        methodFor(container);
        System.out.println("\nВыводим массив с помощью forEach");
        methodForEach(container);
    }

    static void methodDoWhile(int[] container) {
        int index = container.length;
        do {
            System.out.print(container[--index] + " ");// Выводим на экран, полученный массив
        } while (index != 0);
    }

    static void methodWhile(int[] container) {
        int index = container.length;
        while (index != 0) {
            System.out.print(container[--index] + " "); // Выводим на экран, полученный массив
        }

    }

    static void methodFor(int[] container) {
        for (int i = container.length - 1; i >= 0; --i) {
            System.out.print(container[i] + " "); // Выводим на экран, полученный массив
        }
    }

    static void methodForEach(int[] container) {
        int length = 0;

        for (int value : container) {
            // Выводим на экран, полученный массив
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
    }

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] arr = new int[size]; // Создаём массив int размером в size
        System.out.println("Заполните массив. Если надоело - клацай не цифру");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        return arr;
    }
}
