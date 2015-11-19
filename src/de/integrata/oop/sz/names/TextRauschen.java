package de.integrata.oop.sz.names;

import java.util.List;

public class TextRauschen {

	public void addEvenValues(List<Integer> input, List<Integer> output) {
		for (Integer next : input) {
			if (next % 2 == 0) {
				output.add(next);
			}
		}
	}
	
	public boolean equals(Object object, Object anotherObject) {
		return false;
	}
}
