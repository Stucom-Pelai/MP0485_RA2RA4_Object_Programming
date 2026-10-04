package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list with for each
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P43_AverageOfAList.png">
 */
public class P43_AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");

        // Write your code here
        // computes the average of the numbers on the list and prints it.
        // Hint: calculate the average by dividing the total sum by the number of elements in the list, making sure the division produces a decimal value.
    }
}
