package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    @Test
    public void should_return_location_is_W_and_x_is_0_and_y_is_0_when_given_direction_is_N_and_command_is_L_and_x_is_0_and_y_is_0() {
        String direction = "N";
        String command = "L";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_W_and_x_is_0_and_y_is_0_when_given_direction_is_N_and_command_is_R_and_x_is_0_and_y_is_0() {
        String direction = "N";
        String command = "R";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_E_and_x_is_0_and_y_is_0_when_given_direction_is_S_and_command_is_L_and_x_is_0_and_y_is_0() {
        String direction = "S";
        String command = "L";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_W_and_x_is_0_and_y_is_0_when_given_direction_is_S_and_command_is_R_and_x_is_0_and_y_is_0() {
        String direction = "S";
        String command = "R";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_N_and_x_is_0_and_y_is_0_when_given_direction_is_E_and_command_is_L_and_x_is_0_and_y_is_0() {
        String direction = "E";
        String command = "L";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_S_and_x_is_0_and_y_is_0_when_given_direction_is_E_and_command_is_R_and_x_is_0_and_y_is_0() {
        String direction = "E";
        String command = "R";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_S_and_x_is_0_and_y_is_0_when_given_direction_is_W_and_command_is_L_and_x_is_0_and_y_is_0() {
        String direction = "W";
        String command = "L";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_N_and_x_is_0_and_y_is_0_when_given_direction_is_W_and_command_is_R_and_x_is_0_and_y_is_0() {
        String direction = "W";
        String command = "R";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_N_and_x_is_0_and_y_is_1_when_given_direction_is_N_and_command_is_M_and_x_is_0_and_y_is_0() {
        String direction = "N";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_E_and_x_is_1_and_y_is_0_when_given_direction_is_E_and_command_is_M_and_x_is_0_and_y_is_0() {
        String direction = "E";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_S_and_x_is_0_and_y_is_nav_1_when_given_direction_is_S_and_command_is_M_and_x_is_0_and_y_is_0() {
        String direction = "S";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_location_is_W_and_x_is_nav_1_and_y_is_0_when_given_direction_is_W_and_command_is_M_and_x_is_0_and_y_is_0() {
        String direction = "W";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
}