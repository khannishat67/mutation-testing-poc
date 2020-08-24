package com.cognizant.mutationtestingpoc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    private static Main mainObj;
    @BeforeEach
    public void setMainObj() {
        mainObj = new Main("Hello ");
    }

    @Test
    public void test_greet() {
        String greeting = mainObj.greet("Nishat");
        assertNotNull(greeting);
        assertEquals("Hello Nishat", greeting);
    }
    @Test
    public void test_greet_without_name() {
        String greeting = mainObj.greet("");
        assertNotNull(greeting);
        assertEquals("Hello World", greeting);
    }
    @Test
    public void test_greet_wit_null() {
        String greeting = mainObj.greet(null);
        assertNotNull(greeting);
        assertEquals("Hello World", greeting);
    }
    @Test
    public void test_get_greeting() {
        String greeting = mainObj.getGreeting();
        assertEquals("Hello ", greeting);
    }

    @Test
    public void test_set_greeting() {
        mainObj.setGreeting("Not Hello ");
        assertEquals("Not Hello ", mainObj.getGreeting());
    }

}
