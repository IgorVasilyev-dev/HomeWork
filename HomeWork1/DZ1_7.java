package HomeWork1;

public class DZ1_7 {
    public static void main(String[] args) {
        for (String number : args) {
            System.out.println(toBinaryString(Byte.parseByte(number)));
        }
    }

    public static String toBinaryString(byte number) {
        StringBuilder result = new StringBuilder();
        int bit;
        for(int i = 0; i < 8; i++) {
            bit = Math.abs((number >> i) % 2);
            result.insert(0, bit);
        }
        return result.toString();
    }

}
