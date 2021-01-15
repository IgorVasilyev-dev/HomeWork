/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 */

package HomeWork2.loops;

public class Factorial {

    public static void main(String[] args) {

        for (String arg : args) {
            int n = Integer.parseInt(arg);
            long result = 1;
            if (n <= 0) {
                System.out.println("Введены некорректные данные");
            } else {

                for (int i = 1; i <= n; i++) {

                    if (i < n) {
                        result *= i;
                    }
                    if (n == i) {
                        result *= i;
                        System.out.print(i + " = " + result);
                        return;
                    }
                    if (result <= 0) {
                        System.out.print(i + " = переполнение Long ");
                        return;
                    }
                    System.out.print(i + " * ");

                }
                System.out.println(result);
            }
        }
    }
}

