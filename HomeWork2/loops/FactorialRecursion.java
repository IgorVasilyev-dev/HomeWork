/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Используя рекурсию
 */
package HomeWork2.loops;

public class FactorialRecursion {

    public long calcFact(int n) {
        long buff;
        if (n == 1) {
            return 1;
            }
        else if (n == 0 ) {
            return 0;
        }
        else if (n < 0 ) {
            return -1;
        }
        buff = n * calcFact(n -1);
        if (buff > 0) {
            return buff;
        }
        return -1;
    }

    public String toString(int n) {
        StringBuilder str = new StringBuilder();
        if (n <= 0) {
            return "принято недопустимое значение";
        }
        for (int i = 1; i <= n; i++) {
            if (i < n & calcFact(i) > 0) {
                str.append(i).append(" * ");
            } else if (calcFact(i) > 0)  {
                str.append(i).append(" = ").append(calcFact(i));
                break;
            } else {
                str.append(i).append(" = ").append("переполнение");
                break;
            }
        }
        return str.toString();
    }

}

