package HomeWork1;

import static java.lang.Byte.parseByte;

public class DZ1_7 {
    public static void main(String[] args) {
        for (String number : args) {
            System.out.println(String.format("%8s", DZ1_7.toBinaryString(Byte.parseByte(number))).replaceAll(" ", "0"));
        }
    }


    public static String toBinaryString(byte number) {
        return Integer.toBinaryString(number);
    }

}
