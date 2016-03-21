package edu.mondragon.junit.asserts.main;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;
import static org.junit.internal.matchers.StringContains.containsString;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.everyItem;

public class AssertTests {
  @Test
  public void testAssertArrayEquals() {
    byte[] expected = "dual".getBytes();
    byte[] actual = "trial".getBytes();
    assertArrayEquals("failure - byte arrays not same", expected, actual);
    // No funciona por que al cambiar el String, el array de bytes es diferentes.
  }

  @Test
  public void testAssertEquals() {
    assertEquals("failure - strings are not equal", "error", "text");
      // No funciona por que al cambiar el String, el string en si no es igual entre si.
  }

  @Test
  public void testAssertFalse() {
    assertFalse("failure - should be false", true);
      // No funciona por que espera un false, y le hemos metido true.
  }

  @Test
  public void testAssertNotNull() {
    assertNotNull("should not be null", null);
      // No espera un null, así que falla.
  }

  @Test
  public void testAssertNotSame() {
      Object o = new Object();
      assertNotSame("should not be same Object", o, o);
      // Falla por que espera que los objetos sean diferentes.
  }

  @Test
  public void testAssertNull() {
      assertNull("should be null", new Object());
      // Falla por que es un objeto nuevo, no es null.
  }

  @Test
  public void testAssertSame() {
      Integer aNumber = Integer.valueOf(768);
      assertSame("should be same", aNumber, 10);
      // Falla por que los numeros son diferentes.
  }

  // JUnit Matchers assertThat
  @Test
  public void testAssertThatBothContainsString() {
      assertThat("albumen", both(containsString("a")).and(containsString("z")));
      // Falla por que no contiene la letra Z.
  }

  @Test
  public void testAssertThathasItemsContainsString() {
      assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "four"));
      // Falla por que no esta "four" en la lista.
  }

  @Test
  public void testAssertThatEveryItemContainsString() {
      assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("e")));
      // Falla por que no todos los valores de la lista tienen la letra "e".
  }

  @Test
  public void testAssertThatHamcrestCoreMatchers() {
      assertThat("good", allOf(equalTo("bad"), startsWith("b")));
      // Falla por que ni es igual a bad ni empieza por b.
      assertThat("good", not(allOf(equalTo("good"), equalTo("good"))));
      // Falla por que si es igual que good.
      assertThat("good", anyOf(equalTo("bad"), equalTo("bad")));
      // Falla por que ninguno de los de la lista funciona.
      assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(7)).or(equalTo(4))));
      // Falla por que es igual que uno de la lista.
      Object o = new Object();
      assertThat(o, not(sameInstance(o)));
      // Falla por que son el mismo objeto.
  }

  @Test
  public void testAssertTrue() {
      assertTrue("failure - should be true", false);
      // Falla por que el valor es false, espera que sea true.
  }
}	