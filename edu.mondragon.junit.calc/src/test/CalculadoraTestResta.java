package test;

import main.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 22/03/16.
 */
public class CalculadoraTestResta {

    Calculadora calc;

    @Before
    public void preInit() {
        calc = new Calculadora();
    }

    @Test
    public void testResta() {
        assertEquals("", 1, calc.resta(3, 2));
    }

    @Test
    public void expectedErrorResta() {
        assertEquals("Da error ya que supera el límite de la clase: " + calc.limit, -1, calc.resta(10000002, 2));
    }

}
