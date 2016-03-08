package edu.mondragon.junit.parameterized.fibonacci.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.mondragon.junit.parameterized.fibonacci.main.Fibonacci;

@RunWith(Parameterized.class)
public class FibonacciTest {
	
	private int expectedInput, expectedOutput;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}});
    }

    public FibonacciTest(int input, int expected) {
    	expectedInput = input;
    	expectedOutput = expected;
    }

    @Test
    public void test() {
    	Fibonacci f = new Fibonacci();
        assertEquals(expectedOutput, f.compute(expectedInput));
    }

}
