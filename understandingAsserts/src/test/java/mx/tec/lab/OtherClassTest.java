package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OtherClassTest {

	@Test
	public void testMultiply() {
		  try {
			  	OtherClass multiplier = new OtherClass();
		    	multiplier.multiply(5, 10);
		    } catch (IllegalArgumentException e) {
		        assertEquals("X should be less than 1000", e.getMessage());
		    }
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		  try {
			  	OtherClass multiplier = new OtherClass();
		    	multiplier.multiply(5000, 10);
		    } catch (IllegalArgumentException e) {
		        assertEquals("X should be less than 1000", e.getMessage());
		    }
	}
}
