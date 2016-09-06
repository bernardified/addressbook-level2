package seedu.addressbook.common;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
	
	/**
	 * Test Utils isAnyNull method
	 */
	
	@Test
	public void isAnyNull_returnsTrue() {
		Object[] testNullTrue = { null, null, null };
		assertTrue("Null elements should return true", Utils.isAnyNull(testNullTrue));
	}
	
	@Test
	public void isAnyNull_returnsFalse() {
		Object[] testNullFalse = { null, null, 123 };
		assertFalse("1 int element should return false", Utils.isAnyNull(testNullFalse));
	}
	
	/**
	 * Test Utils elementAreUnique method
	 */
	
	@Test
	public void elementsAreUnique_returnsTrue() {
		ArrayList<Integer> testUniqueTrue = new ArrayList<>();
		testUniqueTrue.add(1);
		testUniqueTrue.add(2);
		testUniqueTrue.add(3);
		assertTrue("3 unique Integers should return true", Utils.elementsAreUnique(testUniqueTrue));
	}
	
	@Test
	public void elementsAreUnique_returnFalse() {
		ArrayList<Integer> testUniqueFalse = new ArrayList<>();
		testUniqueFalse.add(1);
		testUniqueFalse.add(2);
		testUniqueFalse.add(1);
		assertFalse("1 duplicate Integer should return false", Utils.elementsAreUnique(testUniqueFalse));
	}

}
