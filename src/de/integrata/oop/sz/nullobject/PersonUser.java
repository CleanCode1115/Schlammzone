package de.integrata.oop.sz.nullobject;

public class PersonUser {

	public static void main(String[] args) {
		
		Person x = Database.findById(123);
		
		Person y = Database.findById(456);

		
		if (x != null && y == null) {
			Person first = x;
			Person last = null;
		}
		
		System.out.println("Team: " + x + " und " + y);
	}
	
	
}
