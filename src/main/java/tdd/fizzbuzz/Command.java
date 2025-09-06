package tdd.fizzbuzz;

public enum Command {
    LEFT("L"), RIGHT("R"), MOVE("M"), BACK("B");

    private final String code;

    Command(String code) {
        this.code = code;
    }

    public String getCode() { return code; }

    public static Command fromCode(String code) {
        for (Command cmd : values()) {
            if (cmd.code.equals(code)) {
                return cmd;
            }
        }
        return MOVE;
    }
}
