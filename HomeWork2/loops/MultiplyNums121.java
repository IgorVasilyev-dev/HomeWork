/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 */

package HomeWork2.loops;

public class MultiplyNums121 {

    public  String resultToString(String number) {
        StringBuilder str = new StringBuilder();
            int num = Integer.parseInt(number);
            int result = 1;
            int revNum = 0;

            while (num != 0) {
                revNum = revNum * 10 + num % 10;
                num /= 10;
            }

            while (revNum > 0) {
                num = revNum % 10;
                str.append(num).append(" ");
                result *= revNum % 10;
                revNum = revNum / 10;

                if (revNum > 0) {
                    str.append("* ");
                }
            }
            str.append("= ").append(result);

        return str.toString();
    }

}




