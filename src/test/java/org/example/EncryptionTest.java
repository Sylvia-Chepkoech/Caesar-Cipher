package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {
    Encryption example =new Encryption("This is us", 2);

    @Test
    public void encryptMessage_returnVJKU_KU_WU() {
        String expected = "VJKU KU WU";
        assertEquals(expected,example.encryptMessage());
    }

    @Test
    public void checkUserMessage() {
        String expected = "This is us";
        assertEquals(expected,example.getmUserMessage());
    }

}
