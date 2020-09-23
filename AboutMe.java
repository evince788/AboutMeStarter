/*
 * Programmer: Elliott Vince
 * Date: September 22, 2020
 * Purpose: Writes a paragraph about me!
 */

public class AboutMe {
	
    public static void main (String [] args) {
        // Declaring the variables
        String myName = "Elliott Vince";
        int myAge = 15;
        double myHeightInMetres = 1.83;

        // Print the values
        System.out.println("Hi, my name is " + myName + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables

        myAge = 19;
        myHeightInMetres = 1.94;
        
        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}
