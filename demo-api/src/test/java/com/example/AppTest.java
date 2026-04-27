package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        // Just testing the logic, not the HTTP layer yet
        String result = app.add(10, 5);
        assertEquals("The sum of 10 and 5 is: 14", result);
    }
}


