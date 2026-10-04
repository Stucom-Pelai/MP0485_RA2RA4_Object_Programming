package main.java.progOO2.p13;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class AgentTest {

    @Test
    public void testFieldsArePrivateStrings() throws Exception {
        Field firstNameField = Agent.class.getDeclaredField("firstName");
        assertTrue("Field 'firstName' should be private", Modifier.isPrivate(firstNameField.getModifiers()));
        assertEquals("Field 'firstName' should be of type String", String.class, firstNameField.getType());

        Field lastNameField = Agent.class.getDeclaredField("lastName");
        assertTrue("Field 'lastName' should be private", Modifier.isPrivate(lastNameField.getModifiers()));
        assertEquals("Field 'lastName' should be of type String", String.class, lastNameField.getType());
    }

    @Test
    public void testConstructorAndToString() {
        Agent a = new Agent("James", "Bond");
        assertEquals("My name is Bond, James Bond", a.toString());
    }

    @Test
    public void testAnotherAgent() {
        Agent a = new Agent("Ethan", "Hunt");
        assertEquals("My name is Hunt, Ethan Hunt", a.toString());
    }
}
