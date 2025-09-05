package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    @Test
    public void should_return_location_is_W_when_given_location_is_N_and_command_is_L() {
        String location = "N";
        String command = "L";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, location);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
    }
}