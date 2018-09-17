package cscie55.hw1;

/*********************
 * name: Dylan Rumph
 * CSCIE-55 HW 1
 * date: 9/16/18
 *********************/

import java.util.Arrays;

public class Elevator
{
    private static final int NUM_FLOORS = 7;
    private static int currentFloor;
    private static boolean direction;
    private static int[] passengers = new int[NUM_FLOORS];

    public Elevator(int currentFloor, boolean direction)
    {
        this.currentFloor = currentFloor;
        this.direction = direction;
    }


    public static void main(String[] args)
    {

    }

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

    public void boardPassenger(int destinationFloor)
    {

        this.passengers[destinationFloor-1]++;

        return;
    }

    public int getCurrentFloor()
    {
        return this.currentFloor;
    }
    public String getDirection()
    {
        if(this.direction)
        {
            return "Up";
        }
        else
        {
            return "Down";
        }
    }
    public String toString()
    {
        return "Floor "+currentFloor+": "+Arrays.stream(this.passengers).sum()+" passengers";
    }
/*    public String getPassengers()
    {
        private int floorPassengers;
        private String floor;

        for(int i = 1; i < 8; i++)
        {
            floorPassengers = this.passengers[i-1];
            floor =

        }


    }
    */
    /*public String toString()
    {
        return getClass().getName()+"[currentFloor="+this.currentFloor+", direction="+this.getDirection()+", passengers="+Arrays.toString(this.passengers)+"]";

    }
    */
}
