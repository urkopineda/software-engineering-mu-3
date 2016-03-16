package edu.mondragon.junit.cesar.test;

import edu.mondragon.junit.cesar.main.CifradoCesar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by urko on 15/03/16.
 */
public class CifradoCesarTestDescrifrar {

    @Test
    public void initTestDescifrar() {
        CifradoCesar cifrador = new CifradoCesar("fliud hvwrc");
        assertEquals(cifrador.descifrarCadena(), "cifra estox");
    }

}
