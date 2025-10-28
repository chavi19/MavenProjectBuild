package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationTest {

    @Test
    public void testRegistrationFields() {
        String username = "chavi";
        String password = "12345";

        assertNotNull("Username should not be null", username);
        assertNotNull("Password should not be null", password);
        assertTrue("Password should be at least 5 characters long", password.length() >= 5);
    }
}
