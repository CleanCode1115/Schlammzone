package de.integrata.oop.sz.nullobject;

import java.util.ArrayList;
import java.util.List;

public class LegacyUser {

	public class ShinyNewAPI {

		private final LegacyCode legacyCode;

		public ShinyNewAPI(LegacyCode legacyCode) {
			this.legacyCode = legacyCode;
		}

		public List<Person> findPerson(Object object) {
			Person[] legacyCodeResult = legacyCode.findPersonsToCriteria(object);
			List<Person> result = new ArrayList<Person>();			
			for (Person person : legacyCodeResult) {
				addPersonToResult(result, person);
			}
			return result;
		}

		private void addPersonToResult(List<Person> result, Person person) {
			if (person != null)
				result.add(person);
			else
				result.add(Person.NULL);
		}
	}

	private ShinyNewAPI database = new ShinyNewAPI(new LegacyCode());
	
	public void doIt() {
		
		List<Person> findPersonsToCriteria = database.findPerson(null);
		
		for (Person person : findPersonsToCriteria) {
			if (person == null) {
				System.out.println("Leere Person");
				continue;
			}
			
			System.out.println(person);
		}
	}
	
}
