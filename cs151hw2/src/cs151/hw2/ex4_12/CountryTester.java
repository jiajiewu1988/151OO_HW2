package cs151.hw2.ex4_12;

import java.util.*;

public class CountryTester {
	public static Comparator<Country> crateComparatorByName(final boolean increasing) {
		return new 
			Comparator<Country>() {
				public int compare(Country c1, Country c2) {
					if (increasing) {
						return (c1.getName().compareTo(c2.getName()));
					} else {
						return -1 * (c1.getName().compareTo(c2.getName()));
					}
				}
			};
	}
	
	public static Comparator<Country> createComparatorByArea(final boolean increasing) {
		return new
			Comparator<Country>() {
				public int compare(Country c1, Country c2) {
					if (increasing) {
						return c1.getArea().compareTo(c2.getArea());
					} else {
						return -1 *(c1.getArea().compareTo(c2.getArea()));
					}
				}
			};
	}
}
