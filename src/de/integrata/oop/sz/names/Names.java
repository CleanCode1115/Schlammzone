package de.integrata.oop.sz.names;

public class Names {

	public void printPrimesBelow(int upperLimit) {
		for (int candidate = 1; candidate < upperLimit; candidate++)
			printIfPrime(candidate); 
	}

	private void printIfPrime(int candidate) {
		if (isPrime(candidate))
			System.out.println(candidate);
	}

	private boolean isPrime(int candidate) {
		for (int divider = 2; divider < candidate; divider++)
			if (canBeDivided(candidate, divider)) return false;
		return true;
	}

	private boolean canBeDivided(int candidate, int divider) {
		return candidate % divider == 0;
	}
	
}
