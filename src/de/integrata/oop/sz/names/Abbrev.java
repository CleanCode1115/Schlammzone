package de.integrata.oop.sz.names;

import java.util.List;

public class Abbrev {

	private List fPoints;
	private List mSparePoints;

	public void doIt(int pMaxNumberOfPoints) {

		while (fPoints.size() > pMaxNumberOfPoints) {
			Point removed = fPoints.removeLast();
			mSparePoints.add(removed);
		}
	}

}
