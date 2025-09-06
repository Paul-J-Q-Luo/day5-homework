package tdd.fizzbuzz;

public class MarsRover {
    public static final String L_COMMAND = "L";
    public static final String R_COMMAND = "R";
    public static final String M_COMMAND = "M";
    public static final String B_COMMAND = "B";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    private int x;
    private int y;
    private String direction;

    public String getDirection() {
        return direction;
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
        this.direction = direction;
    }

    public void executeCommand(String command) {
        command.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(this::createCommand)
                .forEach(CommandExecutor::execute);
    }

    private CommandExecutor createCommand(String command) {
        return switch (command) {
            case L_COMMAND -> this::turnLeft;
            case R_COMMAND -> this::turnRight;
            case B_COMMAND -> this::moveBackward;
            default -> this::moveForward;
        };
    }

    private void turnLeft() {
        direction = switch (direction) {
            case NORTH -> WEST;
            case SOUTH -> EAST;
            case EAST -> NORTH;
            default -> SOUTH;
        };
    }

    private void turnRight() {
        direction = switch (direction) {
            case NORTH -> EAST;
            case SOUTH -> WEST;
            case EAST -> SOUTH;
            default -> NORTH;
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
