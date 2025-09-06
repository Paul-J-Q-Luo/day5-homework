package tdd.fizzbuzz;

public class TurnLeftCommand implements Movement {
    @Override
    public void execute(MarsRover rover) {
        rover.turnLeft();
    }
}