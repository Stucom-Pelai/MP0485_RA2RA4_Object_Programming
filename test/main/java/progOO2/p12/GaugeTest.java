package main.java.progOO2.p12;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class GaugeTest {

    @Test
    public void testFieldIsPrivateInt() throws Exception {
        Field valueField = Gauge.class.getDeclaredField("value");
        assertTrue("Field 'value' should be private", Modifier.isPrivate(valueField.getModifiers()));
        assertEquals("Field 'value' should be of type int", int.class, valueField.getType());
    }

    @Test
    public void testInitialValue() {
        Gauge g = new Gauge();
        assertEquals("Initial value should be 0", 0, g.value());
        assertFalse("Gauge should not be full initially", g.full());
    }

    @Test
    public void testIncrease() {
        Gauge g = new Gauge();
        for (int i = 0; i < 7; i++) {
            g.increase();
        }
        assertEquals("Value should not exceed 5", 5, g.value());
        assertTrue("Gauge should be full at 5", g.full());
    }

    @Test
    public void testDecrease() {
        Gauge g = new Gauge();
        g.increase(); g.increase(); // Value = 2
        g.decrease(); // Value = 1
        assertEquals("Value should be 1 after one decrease", 1, g.value());
        g.decrease(); // Value = 0
        assertEquals("Value should be 0 after another decrease", 0, g.value());
        g.decrease(); // Should stay at 0
        assertEquals("Value should not go below 0", 0, g.value());
        assertFalse("Gauge should not be full at 0", g.full());
    }

    @Test
    public void testFullAtFive() {
        Gauge g = new Gauge();
        for (int i = 0; i < 5; i++) {
            g.increase();
        }
        assertEquals(5, g.value());
        assertTrue("Gauge should be full at 5", g.full());
    }
}
