package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	
	public static final String PREFIX_ADD = "+ ";
	public static final String PREFIX_REMOVE = "- ";
	
	
	enum TaggingType{
		ADD_TAG, REMOVE_TAG;
	}
	
	private String prefix;
	private TaggingType taggingType;
	private Person person;
	private Tag tag; 
	
	public Tagging(TaggingType taggingType, Person person, Tag tag) {
		this.taggingType = taggingType;
		this.person = person;
		this.tag = tag;
		
		if (taggingType == TaggingType.ADD_TAG) {
			prefix = PREFIX_ADD;
		}else if (taggingType == TaggingType.REMOVE_TAG) {
			prefix = PREFIX_REMOVE;
		}
	}
	
	public String getTagging() {
		return prefix + person.getName() + tag;
	}
}
