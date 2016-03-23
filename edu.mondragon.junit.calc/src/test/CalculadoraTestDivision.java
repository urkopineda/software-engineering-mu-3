package test;

import main.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 22/03/16.
 */
public class CalculadoraTestDivision {

    private static final double DELTA = 1e-15;
    Calculadora calc;

    @Before
    public void preInit() {
        calc = new Calculadora();
    }

    @Test
    public void testDivision() {
        assertEquals(1, calc.division(3, 2), DELTA);
    }

    @Test
    public void expectedErrorDivision() {
        assertEquals(-1, calc.division(20000000, 2), DELTA);
    }

}
