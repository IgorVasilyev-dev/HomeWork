package HomeWork1;

public class DZ1_1_3 {
    public static void main(String[] args) {
        byte a = -42;
        byte b = -15;
        System.out.println(Integer.toBinaryString(a)); // 11010110
        System.out.println(Integer.toBinaryString(b)); // 11110001

        int c = ~a;
        System.out.println(c); // 41
        System.out.println(Integer.toBinaryString(c)); // ~11010110 = 00101001

        c = ~b;
        System.out.println(c); // 14
        System.out.println(Integer.toBinaryString(c)); // ~11110001  = 00001110

        a = -42;
        b = -15;
        c = a & b;
        System.out.println(c); // -48
        System.out.println(Integer.toBinaryString(c)); // 11010110 & 11110001 = 11010000

        a = -42;
        b = -15;
        c = a &= b;
        System.out.println(c); // c = -48, a = -48
        System.out.println(Integer.toBinaryString(c)); // 11010000 = 11010110 &= 11110001

        a = -42;
        b = -15;
        c = a | b;
        System.out.println(c); // -9
        System.out.println(Integer.toBinaryString(c)); // 11010110 | 11110001 = 11110111

        a = -42;
        b = -15;
        c = a |= b;
        System.out.println(c); // c = -9, a = -9
        System.out.println(Integer.toBinaryString(c)); // 11010110 |= 11110001 = 11010000

        a = -42;
        b = -15;
        c = a ^ b;
        System.out.println(c); // 39
        System.out.println(Integer.toBinaryString(c)); // 11010110 ^ 11110001 = 00100111

        a = -42;
        b = -15;
        c = a ^= b;
        System.out.println(c); // c = 39, a = 39
        System.out.println(Integer.toBinaryString(c)); // 11010110 ^= 11110001 = 00100111

        a = -42;
        c = a >> 2;
        System.out.println(c); // -11
        System.out.println(Integer.toBinaryString(c)); // 11010110 >> 2 = 11110101

        b = -15;
        c = b >> 2;
        System.out.println(c); // -4
        System.out.println(Integer.toBinaryString(c)); // 11110001 >> 2 = 11111100

        b = -15;
        c = b >>= 2;
        System.out.println(c); // c = -4, b = -4
        System.out.println(Integer.toBinaryString(c)); // 11110001 >> 2 = 11111100

        a = -42;
        byte d = (byte) (a >>> 2);
        System.out.println(d); // -11 для 8ми разрядных значений
        System.out.println(Integer.toBinaryString(d)); // 11010110 >>> 2 = 11110101

        a = -42;
        c = a >>> 2; // для 32х разрядных значений
        System.out.println(c); // 1073741813
        System.out.println(Integer.toBinaryString(c)); // 11111111111111111111111111010110 >>> 2 = 00111111111111111111111111110101

        a = -42;
        b = -15;
        d = (byte) (b >>> 2); // для 8ми разрядных значений
        System.out.println(d); // -4
        System.out.println(Integer.toBinaryString(d)); // 11110001 >>> 2 = 11111100

        a = -42;
        b = -15;
        c = b >>> 2; // для 32 разрядных значений
        System.out.println(c); // 1073741813
        System.out.println(Integer.toBinaryString(c)); // 11111111111111111111111111110001 >>> 2 = 00111111111111111111111111111100

        a = -42;
        d = (byte) (a << 2); // для 8ми разрядных
        System.out.println(d); // 88
        System.out.println(Integer.toBinaryString(d)); // 11010110 << 2 = 01011000

        a = -42;
        c = a << 2 ; // для 32х разрядных значений
        System.out.println(c); // -168
        System.out.println(Integer.toBinaryString(c)); // 11111111111111111111111111010110 << 2 = 11111111111111111111111101011000

        a = -42;
        c = a <<= 2 ; // для 8ми разрядных значений
        System.out.println(c); // c = 88, a = 88
        System.out.println(Integer.toBinaryString(c)); //11010110 <<= 2 = 1011000

        a = -42;
        c = a >>>= 2; // работает как для 8ми разрядных значений
        System.out.println(c); // с = -11, a = -11
        System.out.println(Integer.toBinaryString(c)); //11010110 >>>= 2 = 11110101


        // 1.5 Побитовые операторы работают только с целочисленными типами.
    }
}
