package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(order);

        assertEquals("1", result);
    }

    @Test
    public void should_return_2_when_input_2() {
        int order = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(order);

        assertEquals("2", result);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(order);

        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(order);

        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        int order = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(order);

        assertEquals("FizzBuzz", result);
    }
}
