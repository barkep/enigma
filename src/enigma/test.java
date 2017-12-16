package enigma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {

	private Alfabet a;

	@BeforeEach
	public void setUp() {

		a = new Alfabet("ABCDE");

	}

	@Test
	public void lengthTest() {
		assertEquals(5, a.length());
	}

	@Test
	public void indexOfTest() {
		assertEquals(2, a.indexOf('C'));
	}

	@Test
	public void indexOfTestUndefinedCharTest() {
		assertEquals(2, a.indexOf('X'));
	}

	@Test
	public void charAtTest() {
		assertEquals('C', a.charAt(2));
	}
	
	@Test
	public void charAtTestExceddedTest() {
		assertEquals('C', a.charAt(7));
	}
	
	@Test
	public void charAtTestNegativeExceddedTest() {
	assertEquals('E', a.charAt(-1));
	}
	
	@Test
	public void charAtTestNegativeLengthExceddedTest() {
	assertEquals('E', a.charAt(-6));
	}

}

// prawy przycisk, run as, 1 Junit Test lub alt+shift+x i wybieramy run
