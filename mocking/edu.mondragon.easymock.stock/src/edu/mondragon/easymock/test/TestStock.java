package edu.mondragon.easymock.test;

import edu.mondragon.easymock.stock.Stock;
import org.easymock.TestSubject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 21/03/16.
 */
public class TestStock {

    @TestSubject
    Stock stock = new Stock("TestStock", 1);

    @Test
    public void nameGettersTest() {
        String expectedName = "TestName";
        String name;
        stock.setName(expectedName);
        name = stock.getName();
        assertEquals("Returned name is not the set one", expectedName, name);
    }

    @Test
    public void quantityGettersTest() {
        int expectedQuantity = 10;
        int quantity;
        stock.setQuantity(expectedQuantity);
        quantity = stock.getQuantity();
        assertEquals("Returned quantity is not the set one", expectedQuantity, quantity);
    }

    @Test
    public void constructorTest() {
        String expectedName = "TestStock";
        int expectedQuantity = 1;
        assertEquals("Returned name is not correct", expectedName, stock.getName());
        assertEquals("Returned quantity is not correct", expectedQuantity, stock.getQuantity());
    }

}
