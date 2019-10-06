package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzOneTest {
    @Test
    public void should_return_string_given_number() {
        assertEquals("1", FizzBuzzOne.of(1));
        assertEquals("Fizz", FizzBuzzOne.of(3));
        assertEquals("Fizz", FizzBuzzOne.of(6));
        assertEquals("Buzz", FizzBuzzOne.of(5));
        assertEquals("FizzBuzz", FizzBuzzOne.of(15));
        assertEquals("Fizz", FizzBuzzOne.of(9));
        assertEquals("4", FizzBuzzOne.of(4));
    }
}
