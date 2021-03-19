/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 */

package HomeWork2.loops;

public class MultiplyNums122 {

    public String resultToString(String number) {
        StringBuilder str = new StringBuilder();
        if (number.contains(".") || number.contains(",")) {
            return "Введено не целое число";
        }
        int num = Integer.parseInt(number);

        int result = 1;
        int revNum = 0;

        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }

        while (revNum > 0) {
            str.append(revNum % 10).append(" ");

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



