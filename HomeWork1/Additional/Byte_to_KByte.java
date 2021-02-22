package HomeWork1.Additional;

import java.util.Scanner;

public class Byte_to_KByte {

    public static void main(String[] args) {

        int b = 1024;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        Scanner string = new Scanner(System.in);
        System.out.println("Введите тип: b = byte, k = kb");
        String type = string.nextLine();

        if (type.equals("b")  ) {
            System.out.println(a * b + "b");
        } else if (type.equals("k")) {
            System.out.println(a / b + "kb");
        } else {
            System.out.println("не выбран");
        }

    }

}
