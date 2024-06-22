//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double wage = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.print("Enter your hourly wage: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                wage = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your wage was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);  // initially done is false so !done is true when done is true !done is false
    }
}