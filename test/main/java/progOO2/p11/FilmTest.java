package main.java.progOO2.p11;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class FilmTest {

    @Test
    public void testFieldsArePrivate() throws Exception {
        Field nameField = Film.class.getDeclaredField("name");
        assertTrue("Field 'name' should be private", Modifier.isPrivate(nameField.getModifiers()));
        assertEquals("Field 'name' should be of type String", String.class, nameField.getType());

        Field ageRatingField = Film.class.getDeclaredField("ageRating");
        assertTrue("Field 'ageRating' should be private", Modifier.isPrivate(ageRatingField.getModifiers()));
        assertEquals("Field 'ageRating' should be of type int", int.class, ageRatingField.getType());
    }

    @Test
    public void testConstructorAndAccessors() {
        Film f = new Film("Inception", 13);
        assertEquals("name() should return 'Inception'", "Inception", f.name());
        assertEquals("ageRating() should return 13", 13, f.ageRating());
    }

    @Test
    public void testAnotherFilm() {
        Film f = new Film("The Lion King", 6);
        assertEquals("name() should return 'The Lion King'", "The Lion King", f.name());
        assertEquals("ageRating() should return 6", 6, f.ageRating());
    }
}
