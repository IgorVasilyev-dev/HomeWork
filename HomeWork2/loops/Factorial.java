/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 */

package HomeWork2.loops;

public class Factorial {

    public long calcFactorial(int n) {
        long result = -1;
        if (n > 0) {
            result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
                if (result <= 0) {
                    return -1;
                }
            }
        }
        return  result;
    }

    public String toString(int n) {
        StringBuilder str = new StringBuilder();
        if (n <= 0) {
            return "принято недопустимое значение";
        }
        for (int i = 1; i <= n; i++) {
            if (i < n & calcFactorial(i) > 0) {
                str.append(i).append(" * ");
            } else if (calcFactorial(i) > 0) {
                str.append(i).append(" = ").append(calcFactorial(i));
                break;
            } else {
                str.append(i).append(" = ").append("переполнение");
                break;
            }
        }
        return str.toString();
    }
}

