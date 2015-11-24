package de.integrata.oop.sz.methods;

import java.util.List;

public class PrinterService {

	String name;
	

	public boolean printLetter(Object letter, List<String> basket) {
		return new PrintLetter(this, letter, basket).execute(); 
	}
	
	
}
