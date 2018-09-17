package cscie55.hw1.elevatortest;

/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

//import the Elevator class to test

import cscie55.hw1.elevator.Elevator;

/**
 * ElevatorTest is the abstract base class for all graphics contexts
 * which allow an application to draw onto components realized on
 * various devices or onto off-screen images.
 * Coordinates are infinitely thin and lie between the pixels of the
 * output device.
 * Operations which draw the outline of a figure operate by traversing
 * along the infinitely thin path with a pixel-sized pen that hangs
 * down and to the right of the anchor point on the path.
 * Operations which fill a figure operate by filling the interior
 * of the infinitely thin path.
 * Operations which render horizontal text render the ascending
 * portion of the characters entirely above the baseline coordinate.
 *
 * @author      Dylan Rumph
 * @version     %I%, %G%
 * @since       1.0
 */

public class ElevatorTest {

    /**
    * Constructor method for an Elevator object.
    * The current floor parameter must be set between 1 and NUM_FLOORS.
    * Setting the currentFloor parameter above NUM_FLOORS will result in
    * the parameter being set to NUM_FLOORS.  Setting the value below 1 will
    * result in the parameter being set to 1.  The direction parameter can have
    * two possible values, true or false, corresponding to up and down
    * respectively.
    *
    */

    public static void main(String[] args)
    {
	    Elevator elevator = new Elevator(1, true);

        elevator.boardPassenger(3);
        elevator.boardPassenger(3);
        elevator.boardPassenger(5);

        System.out.println(elevator.toString());

        for (int j = 1; j < 13; j++)
        {
            elevator.move();
        }
    }
}
