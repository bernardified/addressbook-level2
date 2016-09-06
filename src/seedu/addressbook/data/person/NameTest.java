package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

	/**
	 * Test isSimilar method in Name class
	 * @throws IllegalValueException 
	 */
	
	@Test
	public void isSimilar_null_returnsFalse() throws IllegalValueException {
		Name testNull = new Name("John Doe");
		assertFalse("null input should return false", testNull.isSimilar(null));
	}

}
