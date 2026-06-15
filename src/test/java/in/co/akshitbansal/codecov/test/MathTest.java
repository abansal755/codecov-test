package in.co.akshitbansal.codecov.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testAdd() {
		Assertions.assertEquals(3, Math.add(1, 2));
	}
}
