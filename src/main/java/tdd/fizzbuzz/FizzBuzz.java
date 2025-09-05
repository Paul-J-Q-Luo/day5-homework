package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZBUZZ_NUMBER = 15;
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;

    public String countOff(int order) {
        if(order % FIZZBUZZ_NUMBER == 0) {
            return "FizzBuzz";
        }
        if(order % FIZZ_NUMBER == 0) {
            return "Fizz";
        }
        if(order % BUZZ_NUMBER == 0) {
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
