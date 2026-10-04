package main.java.progOO1;

/**
 * <b>Content</b> method calling another method
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P20_ChristmasTree.png">
 */
public class P20_ChristmasTree {

    public static void printStars(int number) {
        
    }

    public static void printSpaces(int number) {
        
    }   

    public static void printChristmasTree(int height) {
    	// tree crown
        // Hint: calculate the number of spaces based on height and index
        // Hint: print the current number of stars
        // Hint: the number of stars increases by 2 on each row

        // tree base
        // Hint: the trunk is indented by height - 2 spaces
        // Hint: print 3 stars for the first part of the trunk
        // Hint: indent the second part of the trunk in the same way
        // Hint: print another 3 stars
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.        
        printChristmasTree(4);
        System.out.println("---");
        printChristmasTree(10);
    }
}
