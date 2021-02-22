package HomeWork1.Additional;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        a = scanner.nextInt();
        System.out.println("Введите число b");
        b = scanner.nextInt();
        System.out.println("Введите число c");
        c = scanner.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Введены рановзначные значения a = b = c = " + b);
        } else if (a > b && a < c || a < b && a > c) {
            System.out.println("Число а " + a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println("Число b " + b);
        } else {
            System.out.println("Число с " + c);
        }

    }

}
