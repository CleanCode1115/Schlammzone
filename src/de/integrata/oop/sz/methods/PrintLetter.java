package de.integrata.oop.sz.methods;

import java.util.List;

class PrintLetter {
	/**
	 * 
	 */
	private final PrinterService printerService;
	private Object letter;
	private List<String> basket;
	private int hashCodeInv;
	
	public PrintLetter(PrinterService printerService, Object letter, List<String> basket) {
		super();
		this.printerService = printerService;
		this.letter = letter;
		this.basket = basket;
	}

	public boolean execute() {
		System.out.println(this.printerService.name);
		hashCodeInv = Integer.MAX_VALUE- letter.hashCode();
		
		printHashCode();
		printInvHashCode();
		printToString();
		printAllItems();
		
		System.out.println("Feddsch!");
		return true;
	}

	private void printAllItems() {
		for (String item : basket) {
			printItem(item);
		}
	}

	private void printItem(String item) {
		System.out.println(item);
	}

	private void printToString() {
		System.out.println(letter.toString());
	}

	private void printHashCode() {
		System.out.println(letter.hashCode());
	}
	
	
}