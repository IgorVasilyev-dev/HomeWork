/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число
        это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
        Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
        Math использовать нельзя.
		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

package HomeWork2.loops;

import java.util.Scanner;

public class SqrNums132 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возводимое число");
        double s = scanner.nextDouble();
        System.out.println("Введите степень числа");
        int sqr = scanner.nextInt();
        if (sqr <= 0) {
            System.out.println("Степень - только положительная и целая");
        } else {
            System.out.println(s + " ^ " + sqr + " = " + sqrt(s, sqr));
        }

    }

    static double sqrt(double a, int b) {
        double c = a;
        for (int i = 1; i < b; i++) {
            a = a * c;
        }
        return a;
    }

}



