/* this is the second demo for CSCIE-55, 2018.
* Here we pass params to the main method where they are picked up as 
* items in the 'args' array 
*
* To compile, do: javac HelloWorld2.java
*
* To run [while in same directory as generated HelloWorld2.class file],
* do: java HellowWorld2 some words go here 
*
*/

public class HelloWorld2 {

    public static void main(String[] args){
        System.out.println("Hello World");
        for (String s : args){
            System.out.println("My arg is: "+s);
        }
    }

}
