package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, wrappers and methods
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P48_DigitalClock.png">
 */
public class P48_DigitalClock {

    public static void main(String[] args) {
        ArrayList<Integer> clock = new ArrayList<>();
//        initializeClock(clock);
        int option;
        do {
//            displayClock(clock);
            option = menu();
            switch (option) {
//                case 1 -> incrementHour(clock);
//                case 2 -> decrementHour(clock);
//                case 3 -> incrementMinute(clock);
//                case 4 -> decrementMinute(clock);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    /**
     * Initializes the clock with four digits, all set to zero.
     *
     * <p><b>Hint:</b> Clear the list and add four {@code 0} values to represent
     * hours and minutes in the format HH:MM.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method initializeClock here

    /**
     * Displays the four clock digits in HH:MM format.
     *
     * <p><b>Hint:</b> Use {@code get()} to access the four elements and insert
     * a colon between the hour and minute digits.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method displayClock here

    /**
     * Displays the menu and reads the user's selected option.
     *
     * @return the option selected by the user
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Increment hour");
        System.out.println("2.- Decrement hour");
        System.out.println("3.- Increment minute");
        System.out.println("4.- Decrement minute");
        System.out.println("0.- Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    /**
     * Increments the hour by one.
     *
     * <p><b>Hint:</b> Increase the hour while keeping it between 00 and 23;
     * when 23 is reached, the next value must be 00.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method incrementHour here

    /**
     * Decrements the hour by one.
     *
     * <p><b>Hint:</b> Decrease the hour while keeping it between 00 and 23;
     * when 00 is reached, the previous value must be 23.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method decrementHour here

    /**
     * Increments the minutes by one.
     *
     * <p><b>Hint:</b> Increase the minutes from 00 to 59; when 59 is reached,
     * reset the minutes to 00 and increment the hour.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method incrementMinute here

    /**
     * Decrements the minutes by one.
     *
     * <p><b>Hint:</b> Decrease the minutes from 59 to 00; when 00 is reached,
     * reset the minutes to 59 and decrement the hour.</p>
     *
     * @param clock the list representing the four clock digits
     */
    // complete the method decrementMinute here
}
