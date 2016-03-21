package edu.mondragon.junit.cesar.test;

import edu.mondragon.junit.cesar.main.CifradoCesar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 21/03/16.
 */
public class CifradoCesarTestMain {

    private ByteArrayOutputStream outputStream;

    @Before
    public void before() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void after() {
        System.setOut(System.out);
    }

    @Test
    public void testMain() throws Exception {
        String expectedOutput = "wrgr or txh vh suhjxqwded hudq odv plvpdv uhvsxhvwdv txh exvfdprv ho uhvwr gh qrvrwurv. gh grqgh yhqjr? d grqgh yrb? fxdqwr wlhpsr whqjr? wrgr or txh sxgh kdfhu ixh vhqwduph b yhu frpr pruld.\n" +
                "todo lo que se preguntaba eran las mismas respuestas que buscamos el resto de nosotros. de donde vengo? a donde voy? cuanto tiempo tengo? todo lo que pude hacer fue sentarme y ver como moria.\n";

        String result;
        System.setOut(new PrintStream(outputStream));
        CifradoCesar.main(new String[]{});
        result = outputStream.toString();
        assertEquals("Returned output does not match the expected one", expectedOutput, result);

    }

}
