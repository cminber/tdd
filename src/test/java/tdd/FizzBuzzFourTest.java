package tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class FizzBuzzFourTest {

    private int number;
    private String expected;

    public FizzBuzzFourTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
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
                {13,"Fizz"},
                {31,"Fizz"},
                {52,"Buzz"},
        });
    }

    @Test
    public void should_return_string_given_interger() {
        assertThat(FizzBuzzFour.of(number)).isEqualTo(expected);
    }

}
