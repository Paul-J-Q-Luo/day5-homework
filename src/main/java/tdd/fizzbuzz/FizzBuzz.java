package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        if(order % FizzBuzzType.FIZZBUZZ.getNumber() == 0) {
            return FizzBuzzType.FIZZBUZZ.getCountOff();
        }
        if(order % FizzBuzzType.FIZZ.getNumber() == 0) {
            return FizzBuzzType.FIZZ.getCountOff();
        }
        if(order % FizzBuzzType.BUZZ.getNumber() == 0) {
            return FizzBuzzType.BUZZ.getCountOff();
        }
        return String.valueOf(order);
    }
}
