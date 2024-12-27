package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQATest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("This is the before each method");
    }

    @Test
    public void demotest() {
        System.out.println("This is the test method");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is the after each method");
    }
}
