package tdd.fizzbuzz;

import java.util.Objects;

public class MarsRover {
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
        if(Objects.equals(direction, "N") && Objects.equals(command, "L")) {
            direction = "W";
        } else if(Objects.equals(direction, "N") && Objects.equals(command, "R")) {
            direction = "E";
        } else if(Objects.equals(direction, "S") && Objects.equals(command, "L")) {
            direction = "E";
        } else if(Objects.equals(direction, "S") && Objects.equals(command, "R")) {
            direction = "W";
        }
    }
}
