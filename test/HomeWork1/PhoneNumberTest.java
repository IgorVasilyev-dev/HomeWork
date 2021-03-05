package test.HomeWork1;

import HomeWork1.PhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {

    @Test
    public void createPhoneNumber() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
}