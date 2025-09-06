package tdd.fizzbuzz;

import java.util.Map;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    private static final Map<Command, Movement> commandMap = Map.of(
            Command.LEFT, new TurnLeftCommand(),
            Command.RIGHT, new TurnRightCommand(),
            Command.MOVE, new MoveForwardCommand(),
            Command.BACK, new MoveBackwardCommand()
    );

    public String getDirection() {
        return direction.getCode();
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.fromCode(direction);
    }

    public void executeCommand(String command) {
        command.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(Command::fromCode)
                .map(commandMap::get)
                .forEach(movement -> movement.execute(this));
    }

    public void turnLeft() {
        direction = switch (direction) {
            case NORTH -> Direction.WEST;
            case SOUTH -> Direction.EAST;
            case EAST -> Direction.NORTH;
            case WEST -> Direction.SOUTH;
        };
    }

    public void turnRight() {
        direction = switch (direction) {
            case NORTH -> Direction.EAST;
            case SOUTH -> Direction.WEST;
            case EAST -> Direction.SOUTH;
            case WEST -> Direction.NORTH;
        };
    }

    public void moveForward() {
        move(1);
    }

    public void moveBackward() {
        move(-1);
    }

    private void move(int step) {
        switch (direction) {
            case NORTH -> y += step;
            case EAST -> x += step;
            case SOUTH -> y -= step;
            case WEST -> x -= step;
        }
    }
}
