package tdd.fizzbuzz;

public class MarsRover {
    public static final String L_COMMAND = "L";
    public static final String R_COMMAND = "R";
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

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public MarsRover(int x, int y, String direction) {
        this.direction = direction;
    }

    public void executeCommand(String command) {
        getCommandExecutor(command).execute();
    }

    private CommandExecutor getCommandExecutor(String command) {
        return switch (command) {
            case L_COMMAND -> this::turnLeft;
            case R_COMMAND -> this::turnRight;
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

    private void moveForward() {
        switch (direction) {
            case NORTH -> ++y;
            case EAST -> ++x;
            case SOUTH -> --y;
            default -> --x;
        }
    }
}
