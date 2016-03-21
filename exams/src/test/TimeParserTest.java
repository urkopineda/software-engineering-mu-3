package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite de testeos de caja blanca.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TimeParserTestParseTimeToSeconds.class, TimeParserTestPrintHour.class})
public class TimeParserTest {}
