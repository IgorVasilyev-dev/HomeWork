package HomeWork1;

import java.util.Scanner;

public class DZ1_5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        if (name.equals("Вася") || name.equals("Анастасия")) {
            if (name.equals("Вася")) {
                System.out.println("Привет");
            }
            System.out.println("Я тебя так долго ждал");

        } else
            System.out.println("Добрый день, а вы кто?");

    }
}