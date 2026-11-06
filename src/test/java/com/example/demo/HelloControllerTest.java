package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {
    private final HelloController controller = new HelloController();

    @Testvoid helloReturnsMessage() {
        assertEquals("Hello CI/CD depuis AWS ECS.", controller.hello());
    }

    @Testvoid addReturnsSum() {
        assertEquals(5, controller.add(2, 3));
    }
}