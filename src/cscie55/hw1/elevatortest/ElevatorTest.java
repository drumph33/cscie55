package cscie55.hw1.elevatortest;

/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

//import the Elevator class to test

import cscie55.hw1.elevator.Elevator;

/**
 * ElevatorTest is a class designed to test the Elevator class in the
 * cscie55.hw1.elevator package.  The goal of ElevatorTest is to verify
 * the functionality of all the currently implemented methods in Elevator.
 * In version 1.0 these methods are the constructor method, boardPassenger(),
 * toString(), and move().
 *
 * @author      Dylan Rumph
 * @version     %I%, %G%
 * @since       1.0
 */

public class ElevatorTest
{
    /**
    * Main method for ElevatorTest which performs a test to confirm that the
    * Elevator class is working properly.  The method declares an Elevator
    * object starting on the first floor moving upwards.  Next, 2 passengers
    * are boarded on the 3rd floor and 1 passenger is boarded on the 5th floor.
    * The state of the Elevator is printed to the console after boarding the
    * passengers.  Finally, the test calls the move method 12 times using a
    * loop.  12 is chosen so that the elevator travels from the first floor to
    * 7th floor and back again.
    *@param args the Java default standard main method parameter
    */

    public static void main(String[] args)
    {
	    Elevator elevator = new Elevator(1, true);

        elevator.boardPassenger(3);
        elevator.boardPassenger(3);
        elevator.boardPassenger(5);

        System.out.println(elevator.toString());

        for (int i = 1; i < 13; i++)
            elevator.move();
    }
}
