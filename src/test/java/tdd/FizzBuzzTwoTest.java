package tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FizzBuzzTwoTest {

    private int number;
    private String result;

    public FizzBuzzTwoTest(int number, String result) {
        this.number = number;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,"1"},
                {3,"Fizz"},
                {6,"Fizz"},
                {5,"Buzz"},
                {10,"Buzz"},
                {15,"FizzBuzz"},
                {30,"FizzBuzz"},
        });
    }

    @Test
    public void should_return_string_given_interger() {
        number = 1;
        result = FizzBuzzTwo.of(number);
        assertEquals("1", result);
    }

}
