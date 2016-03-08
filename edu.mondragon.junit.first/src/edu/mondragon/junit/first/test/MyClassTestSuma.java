package edu.mondragon.junit.first.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.mondragon.junit.first.main.MyClass;

import org.junit.*;

public class MyClassTestSuma {
	
	@Test
	public void testSuma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyClass p = new MyClass();
		Method m = MyClass.class.getDeclaredMethod("suma", int.class, int.class);
		m.setAccessible(true);
		int result = (Integer) m.invoke(new MyClass(), 10, 5);
		assertEquals("10 + 5 es 15", 15, result);
	}

}
