/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 */

package HomeWork2.loops;

public class MultiplyNums122 {

    public static void main(String[] args) {

        for (String arg : args) {
                if (arg.contains(".") || arg.contains(",")) {
                    System.out.println("Введено не целое число");
                    return;
                }
                int num = Integer.parseInt(arg);

                int result = 1;
                int revNum = 0;

                while (num != 0) {
                    revNum = revNum * 10 + num % 10;
                    num /= 10;
                }

                while (revNum > 0) {
                    System.out.print((revNum % 10));

                    result *= revNum % 10;
                    revNum = revNum / 10;

                    if (revNum > 0) {
                        System.out.print(" * ");
                    }
                }
                System.out.print(" = " + result);

            }
        }
    }



