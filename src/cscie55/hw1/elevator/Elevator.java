package cscie55.hw1.elevator;

/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

//import the java utility for arrays to easily work with them

import java.util.Arrays;

/**
 * Elevator is the abstract base class for all graphics contexts
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

public class Elevator
{
    /**
    * Private fields in the Elevator class:
    * NUM_FLOORS: an integer constant setting the amount of floors for Elevator
    * currentFloor: an integer for the current location of the elevator
    * direction: a boolean for direction the elevator is traveling, up or down
    * passengers: an integer array containing the amount of passengers destined
    * for any given floor. The index of the array + 1 is the destination floor.
    */

    private static final int NUM_FLOORS = 7;
    private static int currentFloor;
    private static boolean direction;
    private static int[] passengers = new int[NUM_FLOORS];

    /**
    * Constructor method for an Elevator object.
    * The current floor parameter must be set between 1 and NUM_FLOORS.
    * Setting the currentFloor parameter above NUM_FLOORS will result in
    * the parameter being set to NUM_FLOORS.  Setting the value below 1 will
    * result in the parameter being set to 1.  The direction parameter can have
    * two possible values, true or false, corresponding to up and down
    * respectively.
    *
    * @param currentFloor current location of elevator, range = [1, NUM_FLOORS]
    * @param direction direction elevator is to move. true = up, false = down
    */

    public Elevator(int currentFloor, boolean direction)
    {
        if (currentFloor < 1)
            currentFloor = 1;
        else if (currentFloor > NUM_FLOORS)
            currentFloor = NUM_FLOORS;

        this.currentFloor = currentFloor;
        this.direction = direction;
    }

    public static void main(String[] args)
    {

    }

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

    public void move()
    {
        if (currentFloor == NUM_FLOORS && direction)
        {
            direction = !(direction);
        }
        else if(currentFloor == 1 && !(direction))
        {
            direction = !(direction);
        }
        else
        {
            direction = direction;
        }
        if (direction && currentFloor < NUM_FLOORS)
        {
            currentFloor++;
        }
        else if(!(direction) && currentFloor > 1)
        {
            currentFloor--;
        }
        else
        {
             System.out.println("Invalid destination\n");
        }

        passengers[currentFloor-1] = 0;

        System.out.println(this.toString());

        return;
    }

    /**
    * Constructor method for an Elevator object.
    * The current floor parameter must be set between 1 and NUM_FLOORS.
    * Setting the currentFloor parameter above NUM_FLOORS will result in
    * the parameter being set to NUM_FLOORS.  Setting the value below 1 will
    * result in the parameter being set to 1.  The direction parameter can have
    * two possible values, true or false, corresponding to up and down
    * respectively.
    *
    * @param destinationFloor
    */

    public void boardPassenger(int destinationFloor)
    {

        this.passengers[destinationFloor-1]++;

        return;
    }

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

    public String toString()
    {
        return "Floor "+currentFloor+": "+Arrays.stream(this.passengers).sum()+" passengers";
    }
}
