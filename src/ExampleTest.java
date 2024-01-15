import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {
	
	Example example = new Example();

	@Test
	void addTest() {
		
		assertEquals(5, example.add(2,3));
		
		//fail("Not yet implemented");
	}

}
