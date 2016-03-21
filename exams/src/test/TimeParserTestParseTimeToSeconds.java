package test;

import main.TimeParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 21/03/16.
 */
public class TimeParserTestParseTimeToSeconds {

    @Test
    public void initNormalTest() {
        assertEquals("12:53:26 es X segundos", TimeParser.parseTimeToSeconds("12:53:26"), 46406);
    }

    @Test
    public void initTestFirstNumberException() {
        try {
            TimeParser.parseTimeToSeconds("");
        } catch (NumberFormatException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unrecognized time format first colon");
        }
    }

    @Test
    public void initTestSecondNumberException() {
        try {
            TimeParser.parseTimeToSeconds("12:54");
        } catch (NumberFormatException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unrecognized time format second colon");
        }
    }

    @Test
    public void initTestPM() {
        assertEquals("11:53:26 pm es 86006 segundos", TimeParser.parseTimeToSeconds("11:53:26pm"), 86006);
    }

    @Test
    public void initTestIllegalException() {
        try {
            TimeParser.parseTimeToSeconds("25:45:56");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

}
