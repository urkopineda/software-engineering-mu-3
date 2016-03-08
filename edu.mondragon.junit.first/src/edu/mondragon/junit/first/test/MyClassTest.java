package edu.mondragon.junit.first.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyClassTestMultiply.class, MyClassTestSuma.class, MyClassTestDivision.class, MyClassTestBoolean.class })
public class MyClassTest {

}
