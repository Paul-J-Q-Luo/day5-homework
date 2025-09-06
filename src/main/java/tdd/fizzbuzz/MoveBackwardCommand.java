package tdd.fizzbuzz;

public class MoveBackwardCommand implements Movement {
    @Override
    public void execute(MarsRover rover) {
        rover.moveBackward();
    }
}