package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P02_ReprintTest {

    @Test(timeout = 1000)
    public void testPrintOnce() {
        String simulatedInput = "1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        P02_Reprint.main(null);

        String output = out.toString();
        assertTrue(output.contains("How many times?"));

        String expectedLine = "In a hole in the ground there lived a method";
        int count = output.split(expectedLine, -1).length - 1;
        assertEquals(1, count);
    }

    @Test(timeout = 1000)
    public void testPrintThreeTimes() {
        String simulatedInput = "3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        P02_Reprint.main(null);

        String output = out.toString();
        assertTrue(output.contains("How many times?"));

        String expectedLine = "In a hole in the ground there lived a method";
        int count = output.split(expectedLine, -1).length - 1;
        assertEquals(3, count);
    }
}
