package de.integrata.oop.sz.nullobject;

import java.util.Date;

public class Person {

	private String firstname;
	
	private String lastname;
	
	private Date birthday;

	public Person(String firstname, String lastname, Date birthday) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}
	
	public final static Person NULL = new NullPerson();
	
	public static class NullPerson extends Person {

		private NullPerson() {
			super("<not a person>", "<no name>", new Date(Long.MAX_VALUE));
		}
	}
	
	
}
