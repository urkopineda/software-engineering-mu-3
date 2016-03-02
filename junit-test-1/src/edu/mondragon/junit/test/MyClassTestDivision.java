package edu.mondragon.junit.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.mondragon.junit.first.MyClass;

import org.junit.*;

public class MyClassTestDivision {
	
	@Test
	public void testDivisionNormalValue() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MyClass p = new MyClass();
		Method m = MyClass.class.getDeclaredMethod("division", int.class, int.class);
		m.setAccessible(true);
		int result = (Integer) m.invoke(new MyClass(), 10, 5);
		assertEquals("10 / 5 es 2", 2, result);
	}
	
	@Test
	public void testDivisionYZero() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MyClass p = new MyClass();
		Method m = MyClass.class.getDeclaredMethod("division", int.class, int.class);
		m.setAccessible(true);
		int result = (Integer) m.invoke(new MyClass(), 10, 0);
		assertEquals("10 / 0 es -1", -1, result);
	}

}
