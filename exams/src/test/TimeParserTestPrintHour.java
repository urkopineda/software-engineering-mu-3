package test;

import main.TimeParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 21/03/16.
 */
public class TimeParserTestPrintHour {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    TimeParser parser;

    @Before
    public void preInit() {
        parser = new TimeParser();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void initNormalTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = TimeParser.class.getDeclaredMethod("printHour");
        m.setAccessible(true);
        m.invoke(new TimeParser());
        assertEquals("12:12:12 en segundos es 43932", "43932", outContent.toString());
    }

    @After
    public void postInit() {
        parser = null;
        System.setOut(System.out);
        System.setIn(System.in);
    }

}
