package tdd.fizzbuzz;

public class MoveForwardCommand implements Movement {
    @Override
    public void execute(MarsRover rover) {
        rover.moveForward();
    }
}