/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число
        это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
        Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
        Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 */

package HomeWork2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SqrNums131 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возводимое число");
        double s = scanner.nextDouble();
        System.out.println("Введите степень числа");
        int sqr = scanner.nextInt();
        if (sqr <= 0) {
            System.out.println("Степень - только положительная и целая");
        } else {
            Double result = sqrt(s ,sqr);
            System.out.println(result);
            System.out.print(s + " ^ " + sqr + " = ");
            System.out.print(new DecimalFormat("###,###.0" ).format(result));
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



