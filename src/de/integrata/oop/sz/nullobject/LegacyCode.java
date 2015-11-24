package de.integrata.oop.sz.nullobject;

import java.util.Date;

public class LegacyCode {

	public Person[] findPersonsToCriteria(Object c) {
		
		return new Person[] { new Person("x", "y", new Date()), null, new Person("a", "b", new Date()) };
		
	}
	
	
}
