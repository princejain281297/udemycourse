package com.sum.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumServiceTest {

    private final SumService calculator = new SumServiceImpl();

    @Test
    public void sum(){
        assertEquals(3,calculator.sum(2,1));
        assertEquals(4,calculator.sum(2,2));
    }

}
