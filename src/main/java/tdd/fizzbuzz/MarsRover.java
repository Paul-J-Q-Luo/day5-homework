package tdd.fizzbuzz;

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

    }

    public void executeCommand(String command) {
        y++;
        direction = "N";
    }
}
