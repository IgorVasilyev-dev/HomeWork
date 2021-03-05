package test.HomeWork1;

import HomeWork1.DZ1_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DZ1_4Test {

    @Test
    void sleepIn() {
        assertEquals(false, DZ1_4.sleepIn(true,false));
        assertEquals(true, DZ1_4.sleepIn(false,false));
    }
}