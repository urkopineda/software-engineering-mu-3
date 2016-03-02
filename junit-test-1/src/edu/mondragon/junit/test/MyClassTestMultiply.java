package edu.mondragon.junit.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.mondragon.junit.first.MyClass;

import org.junit.*;

public class MyClassTestMultiply {
	
	@Test
	public void testMultiplyNormalValue() {
		MyClass p = new MyClass();
		assertEquals("10 x 5 es 50", 50, p.multiply(10, 5));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testMultiplyXGreater() {
		MyClass p = new MyClass();
		p.multiply(1000, 5);
	}

}
