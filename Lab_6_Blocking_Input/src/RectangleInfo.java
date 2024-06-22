import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done1 = false;
        boolean done2 = false;
        do {
            System.out.print("Enter the length of the rectangle: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                length = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer

                done1 = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash);
                System.out.println("You have to enter a valid number!");
            }
            System.out.print("Enter the width of the rectangle ");
            if (in.hasNextDouble()) {

                // OK safe to read in a double
                width = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer

                done2 = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash);
                System.out.println("You have to enter a valid number!");
            }

        } while (!done1 && !done2);  // initially done is false so !done is true when done is true !done is false
        area = length * width;
        perimeter = (length * 2) + (width * 2);
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("\nThe area is " + area + ". The perimeter is " + perimeter + ". The diagonal is " + diagonal + ".");
    }
}

