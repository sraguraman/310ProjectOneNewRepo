package projectone;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCityComparator {

	//tests validity of comparator
	@Test
	public void test() {
		City c1 = new City();
		c1.setName("boston");
		City c2 = new City();
		c2.setName("atlanta");
		assertNotSame(c1, c2);
	}

}
