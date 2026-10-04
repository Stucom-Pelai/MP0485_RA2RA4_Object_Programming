package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P27_CompareWordsTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        P27_CompareWords.main(null);  // Call the main method of your program

        return out.toString().trim();  // return output with no extra whitespace
    }

    @Test
    public void testSampleInput1() {
        String input = "  string\nstr ing\n";
        String output = runWithInput(input);
        assertEquals("true", output);
    }

    @Test
    public void testSampleInput2() {
        String input = "string\nmy string\n";
        String output = runWithInput(input);
        assertEquals("false", output);
    }

    @Test
    public void testWithUppercase() {
        String input = " StRiNg \n STR ING\n";
        String output = runWithInput(input);
        assertEquals("true", output);
    }

    @Test
    public void testCompletelyDifferent() {
        String input = "java\npython\n";
        String output = runWithInput(input);
        assertEquals("false", output);
    }
}
