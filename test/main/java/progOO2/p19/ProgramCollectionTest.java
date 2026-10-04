package main.java.progOO2.p19;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProgramCollectionTest {

    @Test
    public void testProgramCollectionInputOutput() {
        // Simulate user input:
        // Two programs: "MasterChef", 60 and "News", 30
        // Then max duration = 40
        String simulatedInput = "MasterChef\n60\nNews\n30\n\n40\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run main
        ProgramCollection.main(new String[]{});

        String consoleOutput = outputStream.toString();

        // Check prompts appear
        assertTrue(consoleOutput.contains("Name:"));
        assertTrue(consoleOutput.contains("Duration:"));
        assertTrue(consoleOutput.contains("Program's maximum duration?"));

        // "News" fits within max duration 40, so should appear
        assertTrue(consoleOutput.contains("News, 30 minutes"));

        // "MasterChef, 60 minutes" should NOT appear
        assertFalse(consoleOutput.contains("MasterChef, 60 minutes"));
    }

    @Test
    public void testAnotherCase() {
        // Input: "Show1", 15; "Show2", 25; maxDuration=20
        String simulatedInput = "Show1\n15\nShow2\n25\n\n20\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ProgramCollection.main(new String[]{});

        String consoleOutput = outputStream.toString();

        // "Show1" should appear
        assertTrue(consoleOutput.contains("Show1, 15 minutes"));

        // "Show2" should NOT appear (too long)
        assertFalse(consoleOutput.contains("Show2, 25 minutes"));
    }
}
