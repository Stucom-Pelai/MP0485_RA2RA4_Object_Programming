package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, wrappers and methods
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P49_Stack.png">
 */
public class P49_Stack {

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
//        fillStack(stack);
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
//                    push(stack);
                    break;
                case 2:
//                    pop(stack);
                    break;
                case 3:
//                    showTop(stack);
                    break;
                case 4:
//                    showBottom(stack);
                    break;
            }
        } while (option != 0);
    }

    /**
     * Displays the stack menu and reads the user's option.
     *
     * <p><b>Hint:</b> Display the available operations and use Scanner to
     * read and return the selected integer option.</p>
     *
     * @return the option selected by the user
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Push");
        System.out.println("2.- Pop");
        System.out.println("3.- Show Top");
        System.out.println("4.- Show Bottom");
        System.out.println("0.- Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    /**
     * Initializes the stack with ten positions.
     *
     * <p><b>Hint:</b> Clear the list and add ten {@code -1} values to
     * represent empty positions in the stack.</p>
     *
     * @param stack the list representing the stack
     */
    // complete the method fillStack here

    /**
     * Adds a new value to the top of the stack.
     *
     * <p><b>Hint:</b> Find the first position containing {@code -1} and
     * replace it with the value entered by the user; do not insert when
     * the stack is full.</p>
     *
     * @param stack the list representing the stack
     */
    // complete the method push here

    /**
     * Removes the top value from the stack.
     *
     * <p><b>Hint:</b> Find the last position that contains a value and
     * replace it with {@code -1}; first check whether the stack is empty.</p>
     *
     * @param stack the list representing the stack
     */
    // complete the method pop here

    /**
     * Displays the value currently at the top of the stack.
     *
     * <p><b>Hint:</b> Find the last position before the first {@code -1}
     * and display its value; first check whether the stack is empty.</p>
     *
     * @param stack the list representing the stack
     */
     // complete the method showTop here

    /**
     * Displays the value at the bottom of the stack.
     *
     * <p><b>Hint:</b> Check the first position of the list; if it is not
     * {@code -1}, that value represents the bottom of the stack.</p>
     *
     * @param stack the list representing the stack
     */
    // complete the method showBottom here
}
