package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Testeos de caja negra.
 *
 * Teniendo encuenta los valores permitidos, deberíamos hacer los siguientes testes:
 *
 *      - HH por encima de 23, por debajo de 0 y entre estos valores.
 *      - HH por encima de 11, por debajo de 0 y entre estos valores con "PM".
 *      - MM por encima de 59, por debajo de 0 y entre estos valores.
 *      - SS por encima de 59, por debajo de 0 y entre estos valores.
 *      - Un string con un formato que no sea ni "HH:MM:SS" ni "HH:MM:SSpm".
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TimeParserCajaNegraParseTimeToSecond.class})
public class TimeParserCajaNegra {}
