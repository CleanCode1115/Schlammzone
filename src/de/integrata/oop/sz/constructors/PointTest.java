package de.integrata.oop.sz.constructors;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testBuilder() {
		
		Point myPoint = Point.createWithAngle(10.0f).andDistance(20.0f);
		
		Point.createWithAngle(10f).andDistance(20f);
		
		
		
		
	}

}
