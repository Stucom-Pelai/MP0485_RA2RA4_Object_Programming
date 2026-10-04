package main.java.progOO2.p16;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class PaymentCardTest {

    @Test
    public void testFieldIsPrivateDouble() throws Exception {
        Field balanceField = PaymentCard.class.getDeclaredField("balance");
        assertTrue("Field 'balance' should be private", Modifier.isPrivate(balanceField.getModifiers()));
        assertEquals("Field 'balance' should be of type double", double.class, balanceField.getType());
    }

    @Test
    public void testConstructorAndToString() {
        PaymentCard card = new PaymentCard(10.0);
        assertEquals("The card has a balance of 10.0 euros", card.toString());
    }

    @Test
    public void testEatAffordably() {
        PaymentCard card = new PaymentCard(10.0);
        card.eatAffordably();
        assertEquals("Balance should decrease by 2.60", "The card has a balance of 7.4 euros", card.toString());

        PaymentCard lowCard = new PaymentCard(2.0);
        lowCard.eatAffordably();
        assertEquals("Balance should remain unchanged if insufficient funds", "The card has a balance of 2.0 euros", lowCard.toString());
    }

    @Test
    public void testEatHeartily() {
        PaymentCard card = new PaymentCard(10.0);
        card.eatHeartily();
        assertEquals("Balance should decrease by 4.60", "The card has a balance of 5.4 euros", card.toString());

        PaymentCard lowCard = new PaymentCard(4.0);
        lowCard.eatHeartily();
        assertEquals("Balance should remain unchanged if insufficient funds", "The card has a balance of 4.0 euros", lowCard.toString());
    }

    @Test
    public void testAddMoney() {
        PaymentCard card = new PaymentCard(10.0);
        card.addMoney(20.0);
        assertEquals("Balance should increase correctly", "The card has a balance of 30.0 euros", card.toString());

        card.addMoney(-5.0);
        assertEquals("Negative amounts should not affect balance", "The card has a balance of 30.0 euros", card.toString());

        PaymentCard maxCard = new PaymentCard(149.0);
        maxCard.addMoney(10.0);
        assertEquals("Balance should not exceed 150", "The card has a balance of 150.0 euros", maxCard.toString());
    }
}
