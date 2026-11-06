package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void helloReturnsMessage() {
        assertEquals("Hello CI/CD depuis AWS ECS", controller.hello());
    }

    @Test
    void addReturnsSum() {
        assertEquals(5, controller.add(2, 3));
    }
}