/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Используя рекурсию
 */
package HomeWork2.loops;

public class FactorialRecursion {

    public static void main(String[] args) {
        int i = 0;
        for ( String arg : args) {
            int n = Integer.parseInt(arg);
            if (n <= 0 || n > 20) {
                System.out.println("Введены некорректные данные");
            } else {
                System.out.println(calcFact(n, i));
            }
        }
    }

    static long calcFact(int n ,int i) {

        i = ++i;

            if (n == 1) {
                System.out.print(i +" = ");
                return 1;
            }
            System.out.print(i + " * ");
            return n * calcFact(n - 1, i);

    }

}

