package main.java.progOO2.p14;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void testFieldIsPrivateInt() throws Exception {
        Field numberField = Multiplier.class.getDeclaredField("number");
        assertTrue("Field 'number' should be private", Modifier.isPrivate(numberField.getModifiers()));
        assertEquals("Field 'number' should be of type int", int.class, numberField.getType());
    }

    @Test
    public void testConstructorAndMultiply() {
        Multiplier m = new Multiplier(3);
        assertEquals("3 * 4 should be 12", 12, m.multiply(4));
        assertEquals("3 * 0 should be 0", 0, m.multiply(0));
        assertEquals("3 * -2 should be -6", -6, m.multiply(-2));
    }

    @Test
    public void testAnotherMultiplier() {
        Multiplier m = new Multiplier(5);
        assertEquals("5 * 5 should be 25", 25, m.multiply(5));
        assertEquals("5 * 1 should be 5", 5, m.multiply(1));
    }
}
