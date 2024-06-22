import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fuel = 0;
        double efficiency = 0;
        double price = 0;
        double cost100 = 0;
        double distance = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                fuel = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer

                done1 = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash);
                System.out.println("You have to enter a valid number!");
            }
            System.out.print("Enter the fuel efficiency in miles per gallon ");
            if (in.hasNextDouble()) {

                // OK safe to read in a double
                efficiency = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer

                done2 = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash);
                System.out.println("You have to enter a valid number!");
            }
            System.out.print("Enter the price of gas per gallon ");
            if (in.hasNextDouble()) {

                // OK safe to read in a double
                price = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer

                done3 = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done1 && !done2 && !done3);  // initially done is false so !done is true when done is true !done is false
        cost100 = price / efficiency * 100;
        distance = fuel * efficiency;
        System.out.println("\nYou can go " + distance + " with what is currently in the tank. Additional fuel will cost " + cost100 + " per hundred miles");
    }
}
