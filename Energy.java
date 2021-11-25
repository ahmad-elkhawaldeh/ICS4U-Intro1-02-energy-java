/*
* Calculates how much energy produced
*
* @author  Ahmad
* @version 1.0
* @since   2021-11-19
*/

import java.util.Scanner;

/**
* Calculates how much energy produced.
*/
final class Energy {
    /**
    * Declaring exponent variable.
    */
    public static final double POW1 = 2;
    /**
    * Declaring exponent variable.
    */
    public static final double POW3 = 10;
    /**
    * Declaring exponent variable.
    */
    public static final double POW5 = 8;
    /**
    * Declaring light variable.
    */
    public static final double POW6 = 2.998;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The Einstein program uses his famous equation to find the
    * energy of an inputted then determine how many kiloton bombs
    * its equivalent to.
    *
    * @param args
    *
    */

    public static void main(final String[] args) {
        // Speed of light const
        final double lightSpeed = POW6 * Math.pow(POW3, POW5);
        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the mass of an object in Kg:");

        // Checks if a float value was inputted
        try {
            myObj.hasNextFloat();

            // Read double input
            final float mass = myObj.nextFloat();

            // process
            final double energy = mass * Math.pow(lightSpeed, POW1);

            // Output
            System.out.println("If " + mass + " kg of mass was converted to "
                + "energy, it would " + "produce " + energy + "(J) . ");
        }
        catch (java.util.InputMismatchException errorCode) {
            // If anything of than a float was inputted, it asks them to input one
            System.out.println("ERROR NUMBER NOT VALID TRY AGAIN.");
            System.out.println("\nDone.");
        }
    }
}
