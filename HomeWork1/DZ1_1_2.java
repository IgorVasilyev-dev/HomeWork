package HomeWork1;

public class DZ1_1_2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c;
        System.out.println(Integer.toBinaryString(a)); // 00101010
        System.out.println(Integer.toBinaryString(b)); // 00001111

        c = ~a;
        System.out.println(c); // -43
        System.out.println(Integer.toBinaryString(c)); // ~00101010  = 11010101

        b = 15;
        c = ~b;
        System.out.println(c); // -16
        System.out.println(Integer.toBinaryString(c)); // ~00001111  = 11110000

        a = 42;
        b = 15;
        c = a & b;
        System.out.println(c); //10
        System.out.println(Integer.toBinaryString(c)); // 00101010 & 00001111 = 00001010

        a = 42;
        b = 15;
        c = a &= b;
        System.out.println(c); //10
        System.out.println(Integer.toBinaryString(c)); // 00101010 &= 00001111 = 1010

        a = 42;
        b = 15;
        c = a | b;
        System.out.println(c); // 47
        System.out.println(Integer.toBinaryString(c)); // 00101010 | 00001111 = 00101111

        a = 42;
        b = 15;
        c = a |= b;
        System.out.println(c); // 47
        System.out.println(Integer.toBinaryString(c)); // 00101010 |= 00001111 = 00101111


        a = 42;
        b = 15;
        c = a ^ b;
        System.out.println(c); // 37
        System.out.println(Integer.toBinaryString(c)); // 00101010 ^ 00001111 = 00100101

        a = 42;
        b = 15;
        c = a ^= b;
        System.out.println(c); // 37
        System.out.println(Integer.toBinaryString(c)); // 00101010 ^= 001111 = 00100101


        a = 42;
        c = a >> 2;
        System.out.println(c); // 10
        System.out.println(Integer.toBinaryString(c)); // 00101010 >> 2 = 00001010


        b = 15;
        c = b >> 2;
        System.out.println(c); // 3
        System.out.println(Integer.toBinaryString(c)); // 00001111 >> 2 = 00000011

        b = 15;
        c = b >>= 2;
        System.out.println(c); // c = 3 , b = 3
        System.out.println(Integer.toBinaryString(c)); // 00001111 >> 2 = 11

        b = 15;
        c = b >>> 2;
        System.out.println(c); // 3
        System.out.println(Integer.toBinaryString(c)); // 1111 >>> 2 = 11

        a = 42;
        c = a >>> 2;
        System.out.println(c); // 10
        System.out.println(Integer.toBinaryString(c)); // 101010 >>> 2 = 1010

        a = 42;
        c = a << 2;
        System.out.println(c); // 168
        System.out.println(Integer.toBinaryString(c)); // 101010 << 2 = 10101000

        b = 15;
        c = b << 2;
        System.out.println(c); // 60
        System.out.println(Integer.toBinaryString(c)); // 00001111 << 2 = 00111100

        b = 15;
        c = b <<= 2;
        System.out.println(c); // c = 60 , b = 60
        System.out.println(Integer.toBinaryString(c)); // 00001111 <<= 2 = 00111100

        a = 42;
        c = a >>>= 2;
        System.out.println(c); // c = 10 , a = 10
        System.out.println(Integer.toBinaryString(c)); // 00101010 >>>= 2 = 00001010
    }
}
