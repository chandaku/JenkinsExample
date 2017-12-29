package com.example.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizBuzzTest {

    @Test
    public void shouldReturnFizWhenDivisibleBy3(){
        exec(3, "fiz");
        exec(12, "fiz");
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5(){
        exec(5, "buzz");
        exec(10, "buzz");
    }

    @Test
    public void shouldReturnFizBuzzWhenDivisibleBy3_5(){
        exec(15, "fizbuzz");
        exec(30, "fizbuzz");
    }

    @Test
    public void shouldReturnNumber(){
        exec(11, "11");
    }

    private void exec(int number, String expected) {
        String result = FizBuzz.createFizBuzz().result(number);
        Assertions.assertEquals(expected, result);
    }
}