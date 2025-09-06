package tdd.fizzbuzz;

@FunctionalInterface
public interface Movement {
    void execute(MarsRover rover);
}