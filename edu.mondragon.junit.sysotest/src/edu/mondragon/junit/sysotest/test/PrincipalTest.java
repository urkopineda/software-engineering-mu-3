package edu.mondragon.junit.sysotest.test;

import static junit.framework.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mondragon.junit.sysotest.main.Principal;

public class PrincipalTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testSuma() {
        String data = "5\n10\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Principal.suma();
        assertEquals("15", outContent.toString());
    }

    @After
    public void exit() {
        System.setOut(System.out);
        System.setIn(System.in);
    }
}

