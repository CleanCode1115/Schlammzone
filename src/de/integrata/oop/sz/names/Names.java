package de.integrata.oop.sz.names;

public class Names {

	public void printPrimesBelow(int upperLimit) {
		for (int candidate = 1; candidate < upperLimit; candidate++) { 
		    boolean isPrime = true; 
		    for (int divider = 2; divider < candidate; divider++) { 
		        if (candidate % divider == 0) { 
		            isPrime = false; 
		            break; 
		        } 
		    } 
		    if (isPrime) { 
		        System.out.println(candidate); 
		    } 
		} 
	}
	
}
