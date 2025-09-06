package tdd.fizzbuzz;

public class TurnRightCommand implements Movement {
    @Override
    public void execute(MarsRover rover) {
        rover.turnRight();
    }
}