package seedu.addressbook.data.person;


public class Contact {
	
	public String value;
	protected boolean isPrivate;
	   
	public Contact(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	/**
	* Checks if a given string is a valid contact detail.
	*/
	public static boolean isValidContact(String test, String regex) {
		return test.matches(regex);
	}
	
	/**
	 * Set this value to new value
	 * @param newValue
	 */
	
	public void setValue(String newValue) {
		value = newValue;
	}
	
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
	    
}
