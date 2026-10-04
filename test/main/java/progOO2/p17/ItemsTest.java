package main.java.progOO2.p17;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ItemsTest {

    @Test
    public void testItemsInputAndOutput() {
        // Simulate user input: two items ("Book", "Laptop") then empty line to stop
        String simulatedInput = "Book\nLaptop\n\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run main
        Items.main(new String[]{});

        String consoleOutput = outputStream.toString();

        // Check that the prompt appears
        assertTrue(consoleOutput.contains("Enter a name, empty will stop:"));

        // Check that items are printed with their names
        assertTrue(consoleOutput.contains("Book"));
        assertTrue(consoleOutput.contains("Laptop"));

        // Ensure "created at" appears (from Item.toString())
        assertTrue(consoleOutput.contains("created at:"));
    }
}
