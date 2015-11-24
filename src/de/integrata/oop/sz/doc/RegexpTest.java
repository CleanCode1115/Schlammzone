package de.integrata.oop.sz.doc;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegexpTest {

	@Test
	public void examplesForDATE_FORMAT_LONG() {
		
		assertStringMatchesDate("20.04.2012");
		assertStringMatchesDate("20-04-2012");
	}

	private void assertStringMatchesDate(String date) {
		assertTrue(Regexp.DATE_FORMAT_LONG.matcher(date).matches());
	}

}
