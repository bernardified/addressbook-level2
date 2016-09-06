package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameTest {

	/**
	 * Test isSimilar method in Name class
	 */
	
	@Test
	public void isSimilar_null_returnsFalse() {
		Name testNull = new Name("John Doe");
		assertFalse("null input should return false", testNull.isSimilar(null));
	}

}
