package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P41_IndexOfSmallest.png">
 */
public class P41_IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        // Write your code here
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        // Hint: keep track of both the smallest value and its index, updating both when a smaller number is found.

        // Hint: compare each list element with the smallest value and print the index when they are equal.

    }
}
