package main.java.progOO2.p20;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testLibraryPrintEverything() {
        // Simulate user input: 
        // Two books: "The Hobbit", 310 pages, 1937 
        // "1984", 328 pages, 1949 
        // Then select "everything" 
        String simulatedInput = "The Hobbit\n310\n1937\n1984\n328\n1949\n\neverything\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        // Capture output 
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Run main 
        Library.main(new String[]{});
        String consoleOutput = outputStream.toString();
        // Check prompts appear 
        assertTrue(consoleOutput.contains("Title:"));
        assertTrue(consoleOutput.contains("Pages:"));
        assertTrue(consoleOutput.contains("Publication year:"));
        assertTrue(consoleOutput.contains("What information will be printed?"));
        // Both books should appear with all information 
        assertTrue(consoleOutput.contains("The Hobbit, 310 pages, 1937"));
        assertTrue(consoleOutput.contains("1984, 328 pages, 1949"));
    }

    @Test
    public void testLibraryPrintNames() {
        // Simulate user input: 
        // Two books: "The Hobbit" and "1984" 
        // Then select "name" 
        String simulatedInput = "The Hobbit\n310\n1937\n1984\n328\n1949\n\nname\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        // Capture output 
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Run main 
        Library.main(new String[]{});
        String consoleOutput = outputStream.toString();
        // Book names should appear 
        assertTrue(consoleOutput.contains("The Hobbit"));
        assertTrue(consoleOutput.contains("1984"));
    }

    @Test
    public void testLibraryDoesNotPrintBookDetailsWhenNameSelected() {
        // Simulate one book and select "name" 
        String simulatedInput = "Dune\n412\n1965\n\nname\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        // Capture output 
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Run main 
        Library.main(new String[]{});
        String consoleOutput = outputStream.toString();

        // The name should appear 
        assertTrue(consoleOutput.contains("Dune"));
        // The complete book information should not be printed 
        assertFalse(consoleOutput.contains("Dune, 412 pages, 1965"));
    }
}
