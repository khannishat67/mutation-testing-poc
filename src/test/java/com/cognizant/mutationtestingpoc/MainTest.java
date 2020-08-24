package com.cognizant.mutationtestingpoc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void test_greet_with_null() {
        String greeting = mainObj.greet(null);
        assertNotNull(greeting);
        assertEquals("Hello World", greeting);
    }
    @Test
    public void test_greet_n_times() {
        String greeting = mainObj.greetNTimes("Nishat", 5);
        String[] arr = greeting.split("\n");
        assertNotNull(greeting);
        assertNotNull(arr);
        assertEquals(5, arr.length);
        // Uncomment the below line to get 100% PITest coverage
//        assertTrue(greeting.contains("Nishat"));
    }
    @Test
    public void test_greet_0_times() {
        String greeting = mainObj.greetNTimes("Nishat", 0);
        assertEquals("", greeting);
    }
    @Test
    public void test_greet_n_times_empty_name() {
        String greeting = mainObj.greetNTimes("", 5);
        String[] arr = greeting.split("\n");
        assertNotNull(greeting);
        assertNotNull(arr);
        assertEquals(5, arr.length);
//        assertTrue(greeting.contains("World"));
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
