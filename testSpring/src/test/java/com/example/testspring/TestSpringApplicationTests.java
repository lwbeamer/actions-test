package com.example.testspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSpringApplicationTests {

    @Autowired
    MathService mathService;


    @Test
    void contextLoads() {
    }

    @Test
    void sumTest(){

        Assertions.assertEquals(42, mathService.sum(30,12));
    }

}
