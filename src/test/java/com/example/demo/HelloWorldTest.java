package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Jenkins CI/CD!,Updated", hw.getMessage());
    }
}
