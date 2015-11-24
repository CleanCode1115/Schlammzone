package de.integrata.oop.sz.various;

import static de.integrata.oop.sz.various.EnumSetDemo.States.HAS_BORDER;
import static de.integrata.oop.sz.various.EnumSetDemo.States.HAS_FOCUS;
import static java.util.EnumSet.of;

import java.util.EnumSet;

public class EnumSetDemo {

	public enum States { HAS_FOCUS, SELECTED, HAS_BORDER, IS_LAZY }
	
	public EnumSetDemo(EnumSet<States> states) {
		for (States state : states) {
			System.out.println(state);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		EnumSet<States> flags = EnumSet.of(HAS_FOCUS, HAS_BORDER);
		
		
		new EnumSetDemo(flags);
		
	}
	
	
	
}
