package de.integrata.oop.sz.methods;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class Exceptions {

	public void performSale() {
		try {
			beginTransaction();
			doPerformSale();
			commit();
		} catch (IOException e) {
			printWarning(e);
			rollback();
		}
	}



	private void doPerformSale() throws IOException {
		writeToFile("header.txt", "los gehts");
		calculateRebate();
		openAccount();
		
		copyData();
		
		writeToFile("audit.txt", "copy erfolgreich");
		
		cleanup();
	}
	
	
	
	public void writeToFile(String name, String text) throws IOException  {
		
			FileWriter writer = new FileWriter(name);
			writer.write(text);
			writer.close();
	}
	
	
}
