package test;

import main.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 22/03/16.
 */
public class CalculadoraTestMultiplicacion {

    Calculadora calc;

    @Before
    public void preInit() {
        calc = new Calculadora();
    }

    @Test
    public void testMultiplicacion() {
        assertEquals("", 6, calc.multiplicacion(3, 2));
    }

    @Test
    public void expectedErrorMultiplicacion() {
        assertEquals("Da error ya que supera el límite de la clase: " + calc.limit, -1, calc.multiplicacion(10000000, 2));
    }

}
