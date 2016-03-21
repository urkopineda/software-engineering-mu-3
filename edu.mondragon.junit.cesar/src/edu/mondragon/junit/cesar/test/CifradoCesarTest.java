package edu.mondragon.junit.cesar.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by urko on 15/03/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CifradoCesarTestCifrar.class, CifradoCesarTestDescrifrar.class, CifradoCesarTestMain.class})
public class CifradoCesarTest {

}
