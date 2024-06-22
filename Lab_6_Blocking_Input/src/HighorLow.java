import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int guess = 0;
        int rand = generator.nextInt(10) + 1;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.print("Enter a guess, the number is between 1 and 10!: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                guess = in.nextInt();
                in.nextLine(); // clears the newline from the buffer
                if (guess == rand){
                    System.out.println("\nThe number was " + rand + ". Your guess was " + guess + ". You were exactly right!");}
                else if (guess > rand) {
                    System.out.println("\nThe number was " + rand + ". Your guess was " + guess + ". You were higher!");}
                else {
                    System.out.println("\nThe number was " + rand + ". Your guess was " + guess + ". You were lower!");}


                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said the temperature was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);  // initially done is false so !done is true when done is true !done is false
    }
}

