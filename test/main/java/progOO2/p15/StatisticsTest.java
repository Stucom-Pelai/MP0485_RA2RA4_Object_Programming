package main.java.progOO2.p15;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StatisticsTest {

    @Test
    public void testFields() throws Exception {
        Field countField = Statistics.class.getDeclaredField("count");
        assertTrue("Field 'count' should be private", Modifier.isPrivate(countField.getModifiers()));
        assertEquals("Field 'count' should be of type int", int.class, countField.getType());

        Field sumField = Statistics.class.getDeclaredField("sum");
        assertTrue("Field 'sum' should be private", Modifier.isPrivate(sumField.getModifiers()));
        assertEquals("Field 'sum' should be of type int", int.class, sumField.getType());

        Field listField = Statistics.class.getDeclaredField("list");
        assertTrue("Field 'list' should be private", Modifier.isPrivate(listField.getModifiers()));
        assertTrue("Field 'list' should be final", Modifier.isFinal(listField.getModifiers()));
        assertEquals("Field 'list' should be of type ArrayList", ArrayList.class, listField.getType());
    }

    @Test
    public void testInitialValues() {
        Statistics s = new Statistics();
        assertEquals("Initial count should be 0", 0, s.getCount());
        assertEquals("Initial sum should be 0", 0, s.sum());
        assertEquals("Initial average should be 0", 0.0, s.average(), 0.0001);
    }

    @Test
    public void testAddNumberAndSum() {
        Statistics s = new Statistics();
        s.addNumber(5);
        s.addNumber(7);
        assertEquals("Count should be 2", 2, s.getCount());
        assertEquals("Sum should be 12", 12, s.sum());
        assertEquals("Average should be 6.0", 6.0, s.average(), 0.0001);
    }

    @Test
    public void testAverageWithNoNumbers() {
        Statistics s = new Statistics();
        assertEquals("Average with no numbers should be 0", 0.0, s.average(), 0.0001);
    }

    @Test
    public void testAddNegativeNumbers() {
        Statistics s = new Statistics();
        s.addNumber(-3);
        s.addNumber(8);
        assertEquals("Count should be 2", 2, s.getCount());
        assertEquals("Sum should be 5", 5, s.sum());
        assertEquals("Average should be 2.5", 2.5, s.average(), 0.0001);
    }
}
