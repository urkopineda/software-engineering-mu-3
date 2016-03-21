package test;

import main.TimeParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 21/03/16.
 */
public class TimeParserCajaNegraParseTimeToSecond {

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
    public void initTestIllegalException1() {
        try {
            TimeParser.parseTimeToSeconds("25:45:56");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException2() {
        try {
            TimeParser.parseTimeToSeconds("-1:45:56");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException3() {
        try {
            TimeParser.parseTimeToSeconds("14:45:56pm");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException4() {
        try {
            TimeParser.parseTimeToSeconds("22:62:56");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException5() {
        try {
            TimeParser.parseTimeToSeconds("22:-12:56");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException6() {
        try {
            TimeParser.parseTimeToSeconds("22:45:65");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

    @Test
    public void initTestIllegalException7() {
        try {
            TimeParser.parseTimeToSeconds("25:45:-21");
        } catch (IllegalArgumentException ex) {
            assertEquals("Debería dar una excepcion", ex.getMessage(), "Unacceptable time specified");
        }
    }

}
