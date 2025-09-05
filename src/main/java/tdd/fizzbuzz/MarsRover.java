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
        if (Objects.equals(command, "L")) {
            if (Objects.equals(direction, "N")) {
                direction = "W";
            } else if (Objects.equals(direction, "S")) {
                direction = "E";
            } else if (Objects.equals(direction, "E")) {
                direction = "N";
            } else {
                direction = "S";
            }
        } else if (Objects.equals(command, "R")) {
            if (Objects.equals(direction, "N")) {
                direction = "E";
            } else if (Objects.equals(direction, "S")) {
                direction = "W";
            } else if (Objects.equals(direction, "E")) {
                direction = "S";
            } else {
                direction = "N";
            }
        } else {
            if (Objects.equals(direction, "N")) {
                ++y;
            } else if (Objects.equals(direction, "E")) {
                ++x;
            } else if (Objects.equals(direction, "S")) {
                --y;
            } else {
                --x;
            }
        }
    }
}
