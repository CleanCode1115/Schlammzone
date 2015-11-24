package de.integrata.oop.sz.doc;

import java.util.regex.Pattern;

public class Regexp {

	//                                                    02   -   04    - 2003
	//                                                    08   .   12    . 99
	static Pattern DATE_FORMAT_LONG = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
	
	
}
