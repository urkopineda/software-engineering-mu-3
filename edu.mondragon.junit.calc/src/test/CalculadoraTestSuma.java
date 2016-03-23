package test;

import main.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 22/03/16.
 */
public class CalculadoraTestSuma {

    Calculadora calc;

    @Before
    public void preInit() {
        calc = new Calculadora();
    }

    @Test
    public void testSuma() {
        assertEquals("", 5, calc.suma(3, 2));
    }

    @Test
    public void expectedErrorSuma() {
        assertEquals("Da error ya que supera el límite de la clase: " + calc.limit, -1, calc.suma(10000000, 2));
    }

}
