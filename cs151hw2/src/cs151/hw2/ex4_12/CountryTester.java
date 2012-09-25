package cs151.hw2.ex4_12;

import java.util.*;

/**
 * Test the Comparator<Country> interface and sort a ArrayList of Country
 * @author Jiajie Wu
 */
public class CountryTester {
	/*
	 * Create a comparator by country name
	 * @param increasing decides if the order after sort should be increasing or decreasing
	 */
	public static Comparator<Country> createComparatorByName(final boolean increasing) {
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
	
	/*
	 * Create a comparator by country area
	 * @param increasing decides if the order after sort should be increasing or decreasing 
	 */
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
	
	public static void main(String args[]) {
		ArrayList<Country> cArrayList = new ArrayList<Country>();
		boolean increasing = true;
		Comparator<Country> cmpByName = createComparatorByName(increasing);
		Comparator<Country> cmpByArea = createComparatorByArea(increasing);
		
		cArrayList.add(new Country("China", 9706961.00));
		cArrayList.add(new Country("S.Korea", 99828.00));
		cArrayList.add(new Country("America", 9629091.00));
		
		System.out.println("The original order of the ArrayList is: ");
		for (Country c : cArrayList) {
			System.out.println("Country Name: " + c.getName() + " area: " + c.getArea());
		}
		
		System.out.println("\nThe order after sort by Country name: ");
		Collections.sort(cArrayList, cmpByName);
		for (Country c : cArrayList) {
			System.out.println("Country Name: " + c.getName() + " area: " + c.getArea());
		}
		
		System.out.println("\nThe order after sort by Country area: ");
		Collections.sort(cArrayList, cmpByArea);
		for (Country c : cArrayList) {
			System.out.println("Country Name: " + c.getName() + " area: " + c.getArea());
		}
		
	}
}
