package main.java.progOO2.p18;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PersonalInformationCollectionTest {

    @Test
    public void testPersonalInformationInputAndOutput() {
        // Simulate user input: two persons, then empty first name to stop
        String simulatedInput = "Alice\nSmith\n111\nBob\nBrown\n222\n\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run main
        PersonalInformationCollection.main(new String[]{});

        String consoleOutput = outputStream.toString();

        // Check that prompts appear
        assertTrue(consoleOutput.contains("First name:"));
        assertTrue(consoleOutput.contains("Last name:"));
        assertTrue(consoleOutput.contains("Identification number:"));

        // Check that names are printed (only first + last name, not IDs)
        assertTrue(consoleOutput.contains("Alice Smith"));
        assertTrue(consoleOutput.contains("Bob Brown"));

        // Ensure IDs are not directly printed in the final output
        assertFalse(consoleOutput.contains("111"));
        assertFalse(consoleOutput.contains("222"));
    }
}
