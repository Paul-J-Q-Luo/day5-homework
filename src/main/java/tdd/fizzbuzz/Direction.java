package tdd.fizzbuzz;

public enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    private final String code;

    Direction(String code) {
        this.code = code;
    }

    public String getCode() { return code; }

    public static Direction fromCode(String code) {
        for (Direction dir : values()) {
            if (dir.code.equals(code)) {
                return dir;
            }
        }
        return NORTH;
    }
}
