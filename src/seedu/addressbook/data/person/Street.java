package seedu.addressbook.data.person;

public class Street {
	
	private String value;
	 
	public Street(String value) {
	         this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	 
	@Override
	public String toString() {
		return value;
	}
	     
	@Override
	public boolean equals(Object other) {
	    return other == this // short circuit if same object
             || (other instanceof Street // instanceof handles nulls
	           && this.value.equals(((Street) other).value)); // state check
	
	}
}