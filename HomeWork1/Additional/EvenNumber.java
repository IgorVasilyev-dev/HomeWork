package HomeWork1.Additional;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner number = new Scanner (System.in);
        System.out.println("Введите число a");
        int a = number.nextInt();

        if (a % 2 != 0){
            System.out.println("Число a нечетное");
        } else {
            System.out.println("Число a четное");
        }

    }
}
