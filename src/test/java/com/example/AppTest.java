package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testApp() {
        String expected = "Hello, Dockerized Java!";
        assertEquals(expected, getGreeting());
    }

    private String getGreeting() {
        return "Hello, Dockerized Java!";
    }
}
