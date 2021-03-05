package test.HomeWork1;

import HomeWork1.DZ1_7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DZ1_7Test {

    @Test
   public void toBinaryString() {
        assertEquals("00101010", DZ1_7.toBinaryString((byte) 42));
        assertEquals("00001111", DZ1_7.toBinaryString((byte) 15));
        assertEquals("11010110", DZ1_7.toBinaryString((byte) -42));
        assertEquals("11110001", DZ1_7.toBinaryString((byte) -15));
    }
}