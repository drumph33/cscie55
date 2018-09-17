package cscie55.hw1.elevator;

/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

//import the java utility for arrays to easily work with them

import java.util.Arrays;

/**
 * Elevator is a class for to model the behavior of an elevator.  The class
 * allows an elevator object to be created and controlled as a real elevator
 * would.  The elevator can move and hold passengers and generally behave just
 * as an elevator would.
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

    /**
    * Main method is empty
    *@param args the Java default standard main method param
    */

    public static void main(String[] args)
    {

    }

    /**
    * A method to control the state of an Elevator object.  The method changes
    * the currentFloor field up or down based on the direction the elevator is
    * supposed to move.  If the elevator is on the bottom floor moving down, the
    * direction changes to move up.  If the elevator is on the top floor moving
    * up the elevator changes direction to move down.  If there are any
    * passengers on the elevator destined for the current floor, the passenger
    * array gets updated so that all of those passengers depart the elevator.
    * Finally, the prints the new state of the elevator by calling the toString
    * method.
    */

    public void move()
    {
        if (this.currentFloor == NUM_FLOORS && this.direction)
            this.direction = !(this.direction);

        else if(this.currentFloor == 1 && !(this.direction))
            this.direction = !(this.direction);

        else if (this.direction && this.currentFloor < NUM_FLOORS)
            this.currentFloor++;

        else if(!(this.direction) && this.currentFloor > 1)
            this.currentFloor--;

        this.passengers[this.currentFloor-1] = 0;

        System.out.println(this.toString());

        return;
    }

    /**
    * Updates the passenger array by adding a new passenger to the array.  Only
    * one passenger may be boarded at a time. The parameter destinationFloor
    * determines which array index will be incremented and ultimately denotes
    * which floor the passenger will depart on. The destinationFloor  must be
    * between 1 and NUM_FLOORS. If it is not then the method will return
    * without changing the passengers array.
    *
    * @param destinationFloor passenger's exit floor, range = [1, NUM_FLOORS]
    */

    public void boardPassenger(int destinationFloor)
    {
        if (destinationFloor < 1 || destinationFloor > NUM_FLOORS)
            return;

        else
            this.passengers[destinationFloor-1]++;

        return;
    }

    /**
    * Returns the current state of the elevator in the form of
    * Floor x: y passengers. This method utilizes the java.util.Arrays
    * package to easily sum the amount of passengers array to yield the total
    * passengers on the elevator.
    *
    * @return String of current state of the elevator i.e. Floor x: y passengers
    */

    public String toString()
    {
        return "Floor "+this.currentFloor+": "+Arrays.stream(this.passengers).sum()+" passengers";
    }
}
