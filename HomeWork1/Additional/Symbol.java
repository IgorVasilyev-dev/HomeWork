package HomeWork1.Additional;

import java.util.Scanner;

public class Symbol {

    public static void main(String[] args) {

        int a;
        System.out.println("Введите челое число от 0 до 256");
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();

        if ( a < 0 || a > 256 ) {
            System.out.println("Таблица ASCII включает 256 символов");
        } else if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
                System.out.println("Это буква " + (char) a);
        } else {
                System.out.print("Это не буква, а символ " + (char) a);
            }

    }
}
