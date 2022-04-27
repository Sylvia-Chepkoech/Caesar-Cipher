package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {
    Decryption newExample = new Decryption("VJKU KU WU", 2);

    @Test
    public void decryptionMessage_returnTHIS_IS_US() {
        String expected = "THIS IS US";
        assertEquals(expected, newExample.decryptMessage());
    }
}