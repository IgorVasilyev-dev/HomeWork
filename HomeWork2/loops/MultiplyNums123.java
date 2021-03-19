/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

package HomeWork2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiplyNums123 {

    public String resultToString(String number) {

        Pattern pattern = Pattern.compile("[\\D&&[^,.]]");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            return "Введено не число";
        }
        else if (number.contains(".") || number.contains(",")) {
            return "Введено не целое число";
        }

        StringBuilder str = new StringBuilder();
        int num = Integer.parseInt(number);
        int result = 1;
        for (int i = 0; i < number.length(); i++) {
            result *= num % 10;
            num = num / 10;
            str.append(number.charAt(i));
            if (i < number.length() - 1) {
                str.append(" * ");
            }
        }
        str.append(" = ").append(result);
        return str.toString();
    }
}



