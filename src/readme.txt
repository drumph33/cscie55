/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

This jar file contains both part 1 and part 2 of HW 1.

To run the Elevator test for part 1 use the following command
from the directory in which the jar is located:

java -cp rumph_dylan_hw1.jar cscie55.hw1.elevatortest.ElevatorTest

There was no output for part 2 but the 5 compiled classes and their source files are included
in the jar file.

Most of the explanation for the assignment is in the JavaDoc comments but I will do a quick
synopsis.

Passengers is an int array because it holds a int value and contains a natural index which can
be used to keep track of destination floor.  I tried to sanitize the methods as much as possible
by make sure an elevator couldnt be created with a current floor less than 1 or greater than NUM_FLOORS.  It also contains an error message if somehow an invalid destination is reached even after sanitation.  Also by causing boardPassenger to return without updating the passengers array if a value less than 1 or greater than NUM_FLOORS was put in as destinationFloor.  I used boolean for direction since there are only 2 options so it would allow easy manipulation via ! and also prevent unwanted values from being possible. Boarding a passenger increments via ++ so that only 1 passenger can be added at a time.  toString was a simple print out of the value with the extra addition of using Arrays.stream().sum() to sum the amount of passengers.  The test file simply creates the elevator object to start on the correct floor in the correct direct and then calls boardPassenger() to add passengers at the specified floors.  Then move is called 12 times with a for loop because the elevator was supposed to move that many times.  I created a version where the elevator is free moving and move only stops when there is a passenger to be released but I did not use it because it ran infinitely.

