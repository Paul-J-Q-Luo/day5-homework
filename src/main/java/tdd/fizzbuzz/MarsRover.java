package tdd.fizzbuzz;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

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
                .map(this::createCommand)
                .forEach(CommandExecutor::execute);
    }

    private CommandExecutor createCommand(Command command) {
        return switch (command) {
            case LEFT -> this::turnLeft;
            case RIGHT -> this::turnRight;
            case BACK -> this::moveBackward;
            case MOVE -> this::moveForward;
        };
    }

    private void turnLeft() {
        direction = switch (direction) {
            case NORTH -> Direction.WEST;
            case SOUTH -> Direction.EAST;
            case EAST -> Direction.NORTH;
            case WEST -> Direction.SOUTH;
        };
    }

    private void turnRight() {
        direction = switch (direction) {
            case NORTH -> Direction.EAST;
            case SOUTH -> Direction.WEST;
            case EAST -> Direction.SOUTH;
            case WEST -> Direction.NORTH;
        };
    }

    private void move(int step) {
        switch (direction) {
            case NORTH -> y += step;
            case EAST -> x += step;
            case SOUTH -> y -= step;
            case WEST -> x -= step;
        }
    }

    private void moveForward() {
        move(1);
    }

    private void moveBackward() {
        move(-1);
    }
}
