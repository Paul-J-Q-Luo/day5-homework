package tdd.fizzbuzz;

public enum FizzBuzzType {
    FIZZ("Fizz", 3),
    BUZZ("Buzz", 5),
    FIZZBUZZ("FizzBuzz", 15);

    private final String countOff;
    private final int number;

    FizzBuzzType(String countOff, int number){
        this.countOff = countOff;
        this.number = number;
    }

    public String getCountOff() {
        return countOff;
    }

    public int getNumber() {
        return number;
    }
}
