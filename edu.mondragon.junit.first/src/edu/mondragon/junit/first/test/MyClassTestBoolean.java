package edu.mondragon.junit.first.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.mondragon.junit.first.main.MyClass;

import org.junit.*;

public class MyClassTestBoolean {
	
	@Test
	public void testBoolean() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MyClass p = new MyClass();
		Method m = MyClass.class.getDeclaredMethod("methodToBeTested", String.class);
		m.setAccessible(true);
		boolean result = (boolean) m.invoke(new MyClass(), "hola");
		assertEquals("10 x 5 es 50", false, result);
	}

}
