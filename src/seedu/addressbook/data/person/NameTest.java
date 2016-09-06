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
	
	@Test
	public void isSimilar_sameName_returnsTrue() throws IllegalValueException {
		Name testSameName = new Name("John Doe");
		assertTrue("same string name should return true", testSameName.isSimilar(new Name("John Doe")));
	}
	
	@Test
	public void isSimilar_differentCasing_returnsTrue() throws IllegalValueException {
		Name testDifferentCasing = new Name("John Doe");
		assertTrue("name in a different casing should return true", testDifferentCasing.isSimilar(new Name("JOhn DOe")));
	}
	
	@Test
	public void isSimilar_subsetName_returnsTrue() throws IllegalValueException {
		Name testSubsetName = new Name("John Doe");
		assertTrue("other name is a subset name should return true", testSubsetName.isSimilar(new Name("John")));
	}
	
	@Test
	public void isSimilar_supersetName_returnsTrue() throws IllegalValueException {
		Name testSupersetName = new Name("John Doe");
		assertTrue("other name is a subset name should return true", testSupersetName.isSimilar(new Name("John Sam Doe")));
	}

}
