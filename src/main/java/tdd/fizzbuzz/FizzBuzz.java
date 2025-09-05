package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        if(order % 15 == 0) {
            return "FizzBuzz";
        }
        if(order % 3 == 0) {
            return "Fizz";
        }
        if(order % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
